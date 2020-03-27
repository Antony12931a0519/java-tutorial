package com.trianing.service;

import java.util.List;

import com.trianing.dal.UserDAO;
import com.trianing.models.UserModel;

public class UserService {

	public List<UserModel> getUsers() {

		UserDAO userDao = new UserDAO();
		return userDao.getUsers();

	}

	public UserModel getUserDetailsByEmail(int email) {

		UserDAO userDao = new UserDAO();
		return userDao.getUserDetailsByEmail(email);

	}

	public String addUser(UserModel userModel) {

		UserDAO userDao = new UserDAO();
		int result = userDao.addUser(userModel);

		if (result > 0) {
			return "User has been added successfully.";
		} else {
			return "User details failed to add.";
		}

	}
	
	public String updateUser(UserModel userModel) {

		UserDAO userDao = new UserDAO();
		int result = userDao.updateUser(userModel);

		if (result > 0) {
			return "User has been updated successfully.";
		} else {
			return "User details failed to update.";
		}

	}

}
