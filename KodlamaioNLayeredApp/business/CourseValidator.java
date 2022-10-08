package KodlamaioNLayeredApp.business;

import java.util.List;

import KodlamaioNLayeredApp.entities.Course;

public class CourseValidator {
	public static boolean isValid(Course course, List<String> courses) {
		if(courses.isEmpty() && course.getCoursePrice()>0) {
			return true;
		}else {
			if(course.getCoursePrice()<=0 || courses.contains(course.getCategoryName()) || courses.contains(course.getCourseName())) {
			return false;
		}else {
			return true;
		}
		}

	}
}
