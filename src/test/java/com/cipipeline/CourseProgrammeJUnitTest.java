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
	public void remove_student_test() {
		course_1.addStudentCourse(student_1);
		course_1.addStudentCourse(student_2);
		course_1.removeStudentCourse(student_2);
		String correctResult = "MadaYehaf_21";
		String currentResult = course_1.getElementStudentList();
		assertTrue(correctResult.equals(currentResult));
	}
	@Test
	public void remove_module_test() {
		course_1.addModuleCourse(module_1);
		course_1.addModuleCourse(module_2);
		course_1.removeModuleCourse(module_2);
		String correctResult = "EE451";
		String currentResult = course_1.getElementModulesList();
		assertTrue(correctResult.equals(currentResult));
	}
}
