package com.cipipeline;

import java.util.ArrayList;
import java.util.List;

public class Module {
	
	private String id;
	private List<Student> studentList;
	private List<CourseProgramme> courseList;
	
	public Module(String id) {
		this.setId(id);
		this.studentList = new ArrayList<Student>();
		this.courseList = new ArrayList<CourseProgramme>();
	}
	
	public void addStudentModule(Student student) {
		studentList.add(student);
		student.addModule(this);
	}
	
	public void removeStudentModule(Student student) {
		studentList.remove(student);
	}
	
	public void addCourse(CourseProgramme cp){
		courseList.add(cp);
		cp.addModuleCourse(this);
	}
	
	public void removeCourse(CourseProgramme cp) {
		courseList.remove(cp);
		cp.removeModuleCourse(this);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<CourseProgramme> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseProgramme> courseList) {
		this.courseList = courseList;
	}

}
