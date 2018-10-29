package org.superlamer.windowsupdate.resource;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;

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

}
