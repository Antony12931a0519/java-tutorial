package com.trianing.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
			String sql = "select fname,email,mobile from user where userid=?";

			// create a prpepared statment
		PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, email);
//			stmt.setString(2, "lkjeslfjw");

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
	
	
	public UserModel getUserDetailsByEmail(String email) {
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
		PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, email);
//			stmt.setString(2, "lkjeslfjw");

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
	
	public UserModel getUserDetailsByUserId(int userId) {
		UserModel user = null;

		try {

			user = new UserModel();
			// registering the driver
			Class.forName("com.mysql.jdbc.Driver");

			// creation of connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/friendbook", "root", "root");

			// creation of query
			// select * from user where email='ali@gmail.com';
			String sql = "select fname,email,mobile from user where userId=?";

			// create a prpepared statment
		PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
//			stmt.setString(2, "lkjeslfjw");

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

	

	
	public int addUser(UserModel userModel) {
		
		try {

			
			// registering the driver
			Class.forName("com.mysql.jdbc.Driver");

			// creation of connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/friendbook", "root", "root");

			// creation of query
			// select * from user where email='ali@gmail.com';
			String sql = "insert into user (fname,email,mobile) values (?,?,?)";

			// create a prpepared statment
		PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userModel.getFname());
			stmt.setString(2, userModel.getEmail());
			stmt.setString(3, userModel.getMobile());
//			stmt.setString(2, "lkjeslfjw");

			// select * from user where email=ali@gmail.com;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				if(rs.next())
					return 1;
				else
					return 0;

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
		

	}
	
public int updateUser(UserModel userModel) {
		
		try {

			
			// registering the driver
			Class.forName("com.mysql.jdbc.Driver");

			// creation of connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/friendbook", "root", "root");

			// creation of query
			// select * from user where email='ali@gmail.com';
			String sql = "update user set fname= ?,email=? where userid= ?";

			// create a prpepared statment
		PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userModel.getFname());
			stmt.setString(2, userModel.getEmail());
			stmt.setInt(3,userModel.getUserId());
//			stmt.setString(2, "lkjeslfjw");

			// select * from user where email=ali@gmail.com;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				if(rs.next())
					return 1;
				else
					return 0;

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
		

	}



}
