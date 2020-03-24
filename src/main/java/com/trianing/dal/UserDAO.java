package com.trianing.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.trianing.models.UserModel;

public class UserDAO {

	public List<UserModel> getUsers() {
		List<UserModel> users = null;

		try {

			users = new ArrayList<>();
			// registering the driver
			Class.forName("com.mysql.jdbc.Driver");

			// creation of connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/friendbook", "root", "root");

			// creation of query
			String sql = "select fname,email,mobile from user";

			// create a statment
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				UserModel user = new UserModel();
				user.setFname(rs.getString("fname"));
				user.setEmail(rs.getString("email"));
				user.setMobile(rs.getString("mobile"));
				users.add(user);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return users;

	}

	public UserModel getUserDetailsByEmail(int email) {
		UserModel user = null;

		try {

			user = new UserModel();
			// registering the driver
			Class.forName("com.mysql.jdbc.Driver");

			// creation of connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/friendbook", "root", "root");

			// creation of query
			// select * from user where email='ali@gmail.com';
			String sql = "select fname,email,mobile from user where email=?";

			// create a prpepared statment
			java.sql.PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, email);

			// select * from user where email=ali@gmail.com;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				user.setFname(rs.getString("fname"));
				user.setEmail(rs.getString("email"));
				user.setMobile(rs.getString("mobile"));

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return user;

	}

}
