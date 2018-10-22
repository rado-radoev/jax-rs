package org.superlamer.rest.messanger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.superlamer.rest.messanger.model.Error;

//@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{
	
	@Override
	public Response toResponse(Throwable exception) {
		Error errorMessage = new Error(exception.getMessage(), 500,"https://stackoverflow.com/");
		
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorMessage)
				.build();
	}

}
