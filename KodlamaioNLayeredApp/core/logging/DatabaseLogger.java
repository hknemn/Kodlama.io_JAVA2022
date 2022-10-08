package KodlamaioNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{

	public void log(String categoryName, String courseName, String courseInstructor, double coursePrice) {
		System.out.println("logged to database: "+categoryName+","+courseName+","+courseInstructor+","+coursePrice);
	}

}
