package KodlamaioNLayeredApp.dataAccess;

import KodlamaioNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{

	public void add(Course course) {
		System.out.println("added course with jdbc");
	}

}
