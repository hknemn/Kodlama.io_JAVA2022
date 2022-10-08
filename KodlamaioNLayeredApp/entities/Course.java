package KodlamaioNLayeredApp.entities;

public class Course {
	private String courseName;
	private String categoryName;
	private String courseInstructor;
	
	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	private double coursePrice;
	
	public Course(String categoryName, String courseName, String courseInstructor, double coursePrice) {
		this.courseName = courseName;
		this.categoryName = categoryName;
		this.courseInstructor = courseInstructor;
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
}
