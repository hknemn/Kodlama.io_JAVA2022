package KodlamaioNLayeredApp.dataAccess;

import KodlamaioNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{

	public void add(Course course) {
		System.out.println("added course with hibernate");
	}

}
