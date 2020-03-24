package com.trianing.controller;

import java.util.List;

import javax.ws.rs.GET;
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

		int userId = 5 ;
		UserService service = new UserService();
		return service.getUserDetailsByEmail(userId);
	}

}
