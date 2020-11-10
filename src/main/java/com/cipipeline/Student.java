package com.cipipeline;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name, dob;
	private int age, id;
	private List<Module> enrolledModules;
	private CourseProgramme coursePrg;
	
	public Student(String name, String dob, int age, int id) {
		this.setName(name);
		this.setDob(dob);
		this.setAge(age);
		this.setId(id);
		enrolledModules = new ArrayList<Module>();
	}
	
	
	public String getUsername() {
		String username = name+age;
		return username;
	}
	
	public void addModule(Module module) {
		enrolledModules.add(module);
		module.addStudentModule(this);
	}
	
	public void removeModule(Module module) {
		enrolledModules.remove(module);
		module.removeStudentModule(this);
	}
	
	public void removeStudentCourse() {
		this.coursePrg = null;
	}
	
	// Accessor & Mutator Methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Module> getEnrolledModules() {
		return enrolledModules;
	}

	public void setEnrolledModules(List<Module> enrolledModules) {
		this.enrolledModules = enrolledModules;
	}

	public CourseProgramme getCoursePrg() {
		return coursePrg;
	}

	public void setCoursePrg(CourseProgramme coursePrg) {
		this.coursePrg = coursePrg;
	}
	

}
