package com.tcs;

public class Course {
	private int course_Id;
	private  String course_Name;
	private String course_Admin;
	private int quiz;
	private int handson;
	
	public Course(int course_Id, String course_Name, String course_Admin, int quiz, int handson) {
		
		this.course_Id = course_Id;
		this.course_Name = course_Name;
		this.course_Admin = course_Admin;
		this.quiz = quiz;
		this.handson = handson;
	}

	public int getcourse_Id()
	{
		return course_Id;
	}
	public void setcourse_Id(int course_Id)
	{
		this.course_Id=course_Id;
	}
	
	public String getcourse_Name()
	{
		return course_Name;
	}
	public void setcourse_Name(String course_Name)
	{
		this.course_Name=course_Name;
	}

	public String getCourse_Admin() {
		return course_Admin;
	}

	public void setCourse_Admin(String course_Admin) {
		this.course_Admin = course_Admin;
	}

	public int getQuiz() {
		return quiz;
	}

	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}

	public int getHandson() {
		return handson;
	}

	public void setHandson(int handson) {
		this.handson = handson;
	}

	
	
	


}