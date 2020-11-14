/*
 * Author: Roshan George
 * Date: 14/11/2020
 * Description: A JUnit Test class. Tests all core methods.					
 */

package com.cipipeline;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.joda.time.DateTime;

public class StudentJUnitTest {
	private Student student_1;
	private Module module_1;
	private Module module_2;
	private CourseProgramme course_1;

	@Before
	public void setUp() throws Exception {
		student_1 = new Student("MadaYehaf", "01-02-00", 21, 17672317);

		module_1 = new Module("EE451");
		module_2 = new Module("CT417");
		course_1 = new CourseProgramme("BP", new DateTime("2019-07-01T00:00:00Z"),
				new DateTime("2029-07-01T00:00:00Z"));
	}

	@Test
	public void test_username() {
		String correctUsernameCase = "MadaYehaf_21; ";
		String currentUsernameCase = student_1.getUsername();
		assertEquals("pass", correctUsernameCase, currentUsernameCase);
	}

	@Test
	public void enroll_student_course_test() {
		student_1.setCoursePrg(course_1);
		CourseProgramme correctCourse = new CourseProgramme("BP", new DateTime("2019-07-01T00:00:00Z"),
				new DateTime("2029-07-01T00:00:00Z"));
		CourseProgramme currentCourse = student_1.getCoursePrg();
		assertTrue((currentCourse.getCourseName()).equals(correctCourse.getCourseName()));
	}

	@Test
	public void enroll_student_module_test() {
		student_1.addModule(module_1);
		Module correctModule = new Module("EE451");
		String currentModules = student_1.getElementsEnrolledModules();
		assertTrue(currentModules.toString().equals(correctModule.getId()));
	}

	@Test
	public void remove_student_module_test() {
		student_1.addModule(module_1);
		student_1.addModule(module_2);
		student_1.removeModule(module_2);
		Module correctModule = new Module("EE451");
		assertTrue(student_1.getElementsEnrolledModules().equals(correctModule.getId()));
	}

}
