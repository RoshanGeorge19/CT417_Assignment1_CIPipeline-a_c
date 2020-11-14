/*
 * Author: Roshan George
 * Date: 14/11/2020
 * Description: A class to create modules, and get relevant module info.					
 */
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
		if (!studentList.contains(student)) { // checks if student already exists
			studentList.add(student);
			student.addModule(this);
		}
	}

	public void removeStudentModule(Student student) {
		if (studentList.contains(student)) {
			studentList.remove(student);
		}
	}

	public void addCourse(CourseProgramme cp) {
		if (!courseList.contains(cp)) {
			courseList.add(cp);
			cp.addModuleCourse(this);
		}
	}

	public void removeCourse(CourseProgramme cp) {
		if (courseList.contains(cp)) {
			courseList.remove(cp);
			cp.removeModuleCourse(this);
		}
	}

	// Accessor & Mutator Methods
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

	// Returns a string of the enrolled courses in the module
	public String getElementsCourseList() {
		StringBuilder sbCL = new StringBuilder();
		for (CourseProgramme cp : courseList) {
			sbCL.append(cp.getCourseName());
		}
		String str = sbCL.toString();
		return str;
	}

	// Returns a string of the students in the course
	public String getElementsStudentList() {
		StringBuilder sbSL = new StringBuilder();
		for (Student s : studentList) {
			sbSL.append(s.getUsername());
		}
		String str = sbSL.toString();
		return str;
	}

	@Override
	public String toString() {
		String str = id + "\n" + getElementsCourseList() + "_" + getElementsStudentList();
		return str;
	}

}
