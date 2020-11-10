package com.cipipeline;

import org.joda.time.DateTime;

public class CourseProgramme {
	
	private String courseName;
	private DateTime startDate, endDate;
	
	public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
		this.setCourseName(courseName);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
				
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

}
