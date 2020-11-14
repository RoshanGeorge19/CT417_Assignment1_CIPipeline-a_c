/*
 * Author: Roshan George
 * Date: 14/11/2020
 * Description: A JUnit Test class. Tests all core methods.					
 */

package com.cipipeline;

import static org.junit.Assert.*;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.*;

public class ModuleJUnitTest {
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
		course_1 = new CourseProgramme("BP", new DateTime("2019-07-01T00:00:00Z"),
				new DateTime("2029-07-01T00:00:00Z"));
		course_2 = new CourseProgramme("BL", new DateTime("2009-07-01T00:00:00Z"),
				new DateTime("2029-07-01T00:00:00Z"));
	}

	@Test
	public void add_student_module_test() {
		module_1.addStudentModule(student_1);
		List<Student> currentStudents = module_1.getStudentList();
		assertTrue(currentStudents.contains(student_1));
	}

	@Test
	public void remove_student_module_test() {
		module_1.addStudentModule(student_1);
		module_1.addStudentModule(student_2);
		module_1.removeStudentModule(student_2);
		String correctStudents = "MadaYehaf_21; ";
		String currentStudents = module_1.getElementsStudentList();
		System.out.println(module_1.getElementsStudentList());
		assertTrue(currentStudents.contentEquals(correctStudents));
	}

	@Test
	public void add_module_course_test() {
		module_1.addCourse(course_1);
		module_1.addCourse(course_2);
		String currentCourse = module_1.getElementsCourseList();
		String correctCourse = "BPBL";
		assertTrue(currentCourse.equals(correctCourse));
	}

	@Test
	public void remove_module_course_test() {
		module_1.addCourse(course_1);
		module_1.addCourse(course_2);
		module_1.removeCourse(course_2);
		String currentCourse = module_1.getElementsCourseList();
		String correctCourse = "BP";
		assertTrue(currentCourse.equals(correctCourse));
	}
}
