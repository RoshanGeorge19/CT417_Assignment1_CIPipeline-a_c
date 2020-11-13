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
		if(!studentList.contains(student)) {
			studentList.add(student);
			student.setCoursePrg(this);
		}
		
	}
	
	public void removeStudentCourse(Student student) {
		if(studentList.contains(student)) {
			studentList.remove(student);
			student.removeStudentCourse();
		}
	}
	
	public void addModuleCourse(Module module) {
		if(!modulesList.contains(module)) {
			modulesList.add(module);
			module.addCourse(this);
		}
	}
	
	public void removeModuleCourse(Module module) {
		if(modulesList.contains(module)) {
			modulesList.remove(module);
			module.removeCourse(this);
		}
	}
	// Accessor & Mutator Methods

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
	
	@Override
	public String toString() {
		String str = this.courseName +"\n"+ this.getStartDate() +"\n"+ this.getEndDate();
		return str;
	}
	

}
