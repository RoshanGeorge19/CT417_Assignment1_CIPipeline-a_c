package com.cipipeline;

import static org.junit.Assert.*;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;



public class CourseProgrammeJUnitTest {
	private Student student_1;
	private Student student_2;
	private Module module_1;
	private CourseProgramme course_1;
	private CourseProgramme course_2;
	
	@Before
	public void setUp() throws Exception {
		student_1 = new Student("MadaYehaf", "01-02-00", 21, 17672317);
		student_2 = new Student("MarkRober", "09-09-00", 21, 13245679);
	
		module_1 = new Module("EE451");		
		course_1 = new CourseProgramme("BP", new DateTime("2019-07-01T00:00:00Z"), new DateTime("2029-07-01T00:00:00Z"));
		course_2 = new CourseProgramme("BL", new DateTime("2009-07-01T00:00:00Z"), new DateTime("2029-07-01T00:00:00Z"));
	}
	@Test
	public void remove_student() {
		course_1.addStudentCourse(student_1);
		List<Student> currentResult = course_1.getStudentList();
		assert(currentResult.contains(student_1));
		assertFalse(currentResult.contains(student_2));
	}

	@Test
	public void remove_module() {
		course_1.addModuleCourse(module_1);
		course_1.removeModuleCourse(module_1);
		List<Module> currentResults = course_1.getModulesList();
		assert(currentResults.contains(module_1));
	}
}
