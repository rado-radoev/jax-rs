package org.superlamer.windowsupdate.resource;

import java.net.URI;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;

import org.superlamer.windowsupdate.beans.ComputerFilterBeans;
import org.superlamer.windowsupdate.model.Computer;
import org.superlamer.windowsupdate.service.ComputerService;


@Path("/computers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_XML} )
public class ComputerResource {
	
	ComputerService computerService = new ComputerService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Computer> getJsonComputers(@BeanParam ComputerFilterBeans filterBeans) {
		System.out.println("Json method called");
		System.out.println(filterBeans.getOsVersion());

		
		if (computerService.getOsVersions().contains(filterBeans.getOsVersion())) {
			System.out.println(filterBeans.getOsVersion());
			return computerService.getAllComputersWithOsVersion(filterBeans.getOsVersion());
		} 

		if (filterBeans.getStart() >= 0 && filterBeans.getSize() > 0) {
			return computerService.getAllComputersPaginated(filterBeans.getStart(), filterBeans.getSize());
		}
		
		return computerService.getAllComputers();
	}
	
	
	@GET
	@Path("/{computerName}")
	public Computer getComputer(@PathParam("computerName") String computerName,
								@Context UriInfo uriInfo) {
		Computer computer = computerService.getComputer(computerName);
		computer.addLinks(getUriForSelf(uriInfo, computer), "self");
		computer.addLinks(getUriForUpdates(uriInfo, computer), "updates");
		
		return computer;
	}
	
	private String getUriForSelf(UriInfo uriInfo, Computer computer) {
		String uri = uriInfo.getBaseUriBuilder()
				.path(ComputerResource.class)
				.path(computer.getComputerName())
				.build()
				.toString();
		
		return uri;
	}
	
	private String getUriForUpdates(UriInfo uriInfo, Computer computer) {
		URI uri = uriInfo.getBaseUriBuilder()
						.path(ComputerResource.class)
						.path(ComputerResource.class, "getUpdateResource")
						.path(UpdateResource.class)
						.resolveTemplate("computerName", computer.getComputerName())
						.build();
		
		return uri.toString();
	}
	
	@POST
	public Response addComputer(Computer computer, @Context UriInfo uriInfo) {
		Computer newComputer = computerService.addComputer(computer);
		URI uri = uriInfo.getAbsolutePathBuilder().path(computer.getComputerName()).build();
		System.out.println(uri.toString());
		computer.addLinks(String.valueOf(uri), "self");
		computer.addLinks(getUriForUpdates(uriInfo, computer), "comments");
		
		return Response.created(uri)
						.status(Status.OK)
						.entity(newComputer)
						.build();
	}
	
	@PUT
	@Path("/{computerName}")
	public Computer updateComputer(Computer computer, @PathParam("computerName") String computerName) {
		computer.setComputerName(computerName);
		return computerService.updateComputer(computer);
	}
	
	@DELETE
	@Path("/{compterName}")
	public Computer deleteComputer(@PathParam("computerName") String computerName) {
		return computerService.removeComputer(computerName);
	}
	
	@Path("/{computerName}/updates")
	public UpdateResource getUpdateResource() {
		return new UpdateResource();
	}

}














