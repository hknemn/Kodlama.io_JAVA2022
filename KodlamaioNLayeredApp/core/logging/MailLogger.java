package KodlamaioNLayeredApp.core.logging;

public class MailLogger implements Logger {
	
	public void log(String categoryName, String courseName, String courseInstructor, double coursePrice) {
		System.out.println("logged to mail: "+categoryName+","+courseName+","+courseInstructor+","+coursePrice);
	}
}
