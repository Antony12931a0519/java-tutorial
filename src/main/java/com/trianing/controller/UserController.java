package com.trianing.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
