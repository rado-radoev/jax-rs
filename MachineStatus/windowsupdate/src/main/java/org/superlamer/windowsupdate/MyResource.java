package org.superlamer.windowsupdate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	
	
	/**
	 * 
	 * This project will be used for Windows Update Status tracking
	 * 
	 * A machine will be running windows updates and will be posting
	 * its status to a webserver using restful API
	 * 
	 * The webserver will be using basic authentication
	 * 
	 * Example 
	 * 	The client machine starts windows updates and will post - Updating started
	 *  The client machine then finds an update and will post - updates found .... the updates found
	 * 	etc....
	 *  Once completed it will post status completed
	 *  
	 *  
	 *  There will be a client that reads these messages and acts upon the completion message (this will not be implemented here
	 *  this only serves as what would could happen)
	 * 
	 *  Different classes to be implemented ....
	 *  TBD
	 *  
	 *  
	 * 
	 */
	
	
	
	
	
	
	
	
	

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
