package com.trianing.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.trianing.models.ConsolidatedStudentModel;
import com.trianing.models.StudentModel;

@Path("students")
public class StudentsController {

	@Path("/list")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentModel> getStudents() {

		List<StudentModel> studentList = new ArrayList<StudentModel>();
		StudentModel student = new StudentModel();
		student.setRollNo(101);
		student.setName("Antony");

		StudentModel student1 = new StudentModel();
		student1.setRollNo(102);
		student1.setName("Harsh");

		studentList.add(student);
		studentList.add(student1);

		return studentList;
	}

	@Path("/student/1")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public StudentModel getStudentDetails() {

		StudentModel student = new StudentModel();
		student.setRollNo(1);
		student.setName("Antony");

		return student;
	}

	@Path("/department/cse")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ConsolidatedStudentModel getStudentDetailsByDepatment() {

		ConsolidatedStudentModel ref = new ConsolidatedStudentModel();

		List<StudentModel> studentList = new ArrayList<StudentModel>();
		StudentModel student = new StudentModel();
		student.setRollNo(101);
		student.setName("Antony");

		StudentModel student1 = new StudentModel();
		student1.setRollNo(102);
		student1.setName("Harsh");

		studentList.add(student);
		studentList.add(student1);
		ref.setStudentsList(studentList);
		ref.setDepartment("cse");

		return ref;
	}

}
