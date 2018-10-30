package org.superlamer.windowsupdate.resource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.superlamer.windowsupdate.model.Update;
import org.superlamer.windowsupdate.service.UpdateService;

@Path("/")
public class UpdateResource {
	
    private UpdateService updateService = new UpdateService();
    
    @GET
    public List<Update> getAllUpdates(@PathParam("computerName") String computerName) {
    	return updateService.getAllUpdtes(computerName);
    }
    
    @GET
    @Path("/{kbNumber}")
    public Update getUpdate(@PathParam("computerName") String computerName,
    						@PathParam("kbNumber") long kbNumber,
    						@Context UriInfo uriInfo) {
    	return updateService.getUpdte(computerName, kbNumber);
    }
    
    @POST
    public Update addUpdate(@PathParam("computerName") String computerName,
    						Update update) {
    	System.out.println("Update Resource - POST: " + computerName + " " + update.toString());
    	return updateService.addUpdate(computerName, update);
    }
    
    @PUT
    @Path("/{kbNumber}")
    public Update updateUpdate(@PathParam("computerName") String computerName,
    							Update update) {
    	return updateService.updateUpdate(computerName, update);
    }
    
    @DELETE
    @Path("/{kbNumber}")
    public Update removeUpdate(@PathParam("computerName") String computerName,
    							@PathParam("kbNumber") long kbNumber) {
    	return updateService.removeUpdate(computerName, kbNumber);
    }

}
