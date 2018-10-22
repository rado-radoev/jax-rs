package org.superlamer.rest.messanger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.superlamer.rest.messanger.model.Error;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException exception) {
		Error errorMessage = new Error(exception.getMessage(), 404,"https://stackoverflow.com/");
		
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}

}
