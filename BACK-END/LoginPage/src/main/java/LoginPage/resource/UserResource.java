package LoginPage.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import LoginPage.bo.UserBO;
import LoginPage.to.UserTO;

@Path("/login")
public class UserResource {
	
	UserBO userBO = new UserBO();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response userLogin(UserTO user) {
			return Response
					.status(200)
					.entity(userBO.validation(user))
					.build();
	}
}
