package com.trianing.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.trianing.models.UserModel;
import com.trianing.service.UserService;

@Path("users")
public class UserController {

	@Path("/list")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserModel> getUsers() {

		UserService service = new UserService();
		return service.getUsers();
	}

	@Path("/details/ali@gmail.com")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel getUserDetailsByEmail() {

		int userId = 5;
		UserService service = new UserService();
		return service.getUserDetailsByEmail(userId);
	}

	@Path("/details/{email}/{role}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel getUserDetailsByEmail(@PathParam("email") String email,@PathParam("role") String role) {

		
		UserService service = new UserService();
		return service.getUserDetailsByEmail(email);
	}
	
	@Path("/details")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel getUserDetailsByEmailUsingQueryParam(@QueryParam("email") String email,@QueryParam("role") String role) {

		
		UserService service = new UserService();
		return service.getUserDetailsByEmail(email);
	}
	
	@Path("/details")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel getUserDetailsByEmailUsingQueryParam1(@QueryParam("userid") int userId) {

		
		UserService service = new UserService();
		return service.getUserDetailsByEmail(userId);
	}

	@Path("/details/{userid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel getUserDetailsByUserId(@PathParam("userid") int userid) {

		UserService service = new UserService();
		return service.getUserDetailsByUserId(userid);
	}

	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addUser(UserModel userModel) {
		UserService service = new UserService();
		return service.addUser(userModel);

	}

	@Path("/update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateUser(UserModel userModel) {
		UserService service = new UserService();
		return service.updateUser(userModel);

	}

}
