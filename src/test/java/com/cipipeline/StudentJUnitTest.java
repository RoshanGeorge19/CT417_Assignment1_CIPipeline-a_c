package com.cipipeline;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.joda.time.DateTime;
public class StudentJUnitTest {
	


	private Student student_1;
	private Student student_2;
	private Module module_1;
	private Module module_2;
	private CourseProgramme course_1;
	

	@Before
	public void setUp() throws Exception {
		student_1 = new Student("MadaYehaf", "01-02-00", 21, 17672317);
		student_2 = new Student("MarkRober", "09-09-00", 21, 13245679);
		
		module_1 = new Module("EE451");
		module_2 = new Module("CT417");
		
		course_1 = new CourseProgramme("BP", new DateTime("2019-07-01T00:00:00Z"), new DateTime("2029-07-01T00:00:00Z"));
	}

	
	@Test
	public void test_username() {
		String correctUsernameCase = "MadaYehaf_21";
		String currentUsernameCase = student_1.getUsername();
		assertEquals("pass",correctUsernameCase, currentUsernameCase);
	}
	
	@Test
	public void test_enrollment_to_course() {
		student_1.setCoursePrg(course_1);
		CourseProgramme correctCourse =  new CourseProgramme("BP", new DateTime("2019-07-01T00:00:00Z"), new DateTime("2029-07-01T00:00:00Z"));
		CourseProgramme currentCourse = student_1.getCoursePrg();	
		assertEquals(correctCourse, currentCourse);
	}

	@Test
	public void test_enrollment_to_module() {
		student_1.addModule(module_1);
		Module correctModule = new Module("EE451");
		List<Module> currentModules= student_1.getEnrolledModules();
		assertEquals("pass",currentModules.contains(correctModule));
	}

	@Test
	public void test_remove_from_module() {
		student_1.addModule(module_1);
		student_1.addModule(module_2);
		student_1.removeModule(module_2);
		assertEquals(student_1.getEnrolledModules(), student_2.getEnrolledModules());
	}


}
