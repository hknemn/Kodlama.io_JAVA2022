package KodlamaioNLayeredApp.business;

import java.util.*;

import KodlamaioNLayeredApp.core.logging.Logger;
import KodlamaioNLayeredApp.dataAccess.CourseDao;
import KodlamaioNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Logger> loggers;
	private List<String> courses;
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers, List<String> courses) {
		this.courseDao = courseDao;
		this.loggers=loggers;
		this.courses=courses;
	}
	
	public void add(Course course) throws Exception{		
		
		if(!CourseValidator.isValid(course,courses)) {
			throw new Exception("course couldnt add!");
		}
		
		courses.add(course.getCategoryName());
		courses.add(course.getCourseName());
		courseDao.add(course);
		
		for(Logger logger:loggers) {
			logger.log(course.getCategoryName(),course.getCourseName(),course.getCourseInstructor(),course.getCoursePrice());
		}
	}		
}
