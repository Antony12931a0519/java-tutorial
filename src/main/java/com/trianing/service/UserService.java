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

}
