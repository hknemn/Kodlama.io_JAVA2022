package KodlamaioNLayeredApp;

import java.util.ArrayList;
import java.util.List;

import KodlamaioNLayeredApp.business.CourseManager;
import KodlamaioNLayeredApp.core.logging.DatabaseLogger;
import KodlamaioNLayeredApp.core.logging.FileLogger;
import KodlamaioNLayeredApp.core.logging.Logger;
import KodlamaioNLayeredApp.core.logging.MailLogger;
import KodlamaioNLayeredApp.dataAccess.JdbcCourseDao;
import KodlamaioNLayeredApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Programming","Java Bootcamp","Engin Demirog",100);
		Course course2 = new Course("Senior Programming","C# Bootcamp","Engin Demirog",150);
		
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		
		List<String> courses = new ArrayList<>();
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
		courseManager.add(course1);
		courseManager.add(course2);

	}

}
