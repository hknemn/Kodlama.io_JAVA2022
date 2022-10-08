package KodlamaioNLayeredApp.core.logging;

public class FileLogger implements Logger{
	
	public void log(String categoryName, String courseName, String courseInstructor, double coursePrice) {
		System.out.println("logged to file: "+categoryName+","+courseName+","+courseInstructor+","+coursePrice);
	}
}
