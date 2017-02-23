package services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/Room")
public class RoomLocatorService {
	
	@GET
	@Path("/Meeting")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllGalaxies(@HeaderParam("uid") String uid) {
		
		
		return null;
		
		
	}
}
