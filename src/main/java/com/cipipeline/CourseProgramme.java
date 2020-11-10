package com.cipipeline;

import java.util.List;

import org.joda.time.DateTime;

public class CourseProgramme {
	
	private String courseName;
	private DateTime startDate, endDate;
	private List<Module> modulesList;
	private List<Student> studentList;
	
	public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
		this.setCourseName(courseName);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
				
	}
	
	public void addStudentCourse(Student student) {
		
	}
	
	public void removeStudentCourse(Student student) {
		
	}
	
	public void addModuleCourse(Module module) {
		
	}
	
	public void removeModuleCourse(Module module) {
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	public List<Module> getModulesList() {
		return modulesList;
	}

	public void setModulesList(List<Module> modulesList) {
		this.modulesList = modulesList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	

}
