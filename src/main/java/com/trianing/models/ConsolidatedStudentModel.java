package com.trianing.models;

import java.util.List;

public class ConsolidatedStudentModel {

	List<StudentModel> studentsList;
	private String department;

	/**
	 * @return the studentsList
	 */
	public List<StudentModel> getStudentsList() {
		return studentsList;
	}

	/**
	 * @param studentsList
	 *            the studentsList to set
	 */
	public void setStudentsList(List<StudentModel> studentsList) {
		this.studentsList = studentsList;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

}
