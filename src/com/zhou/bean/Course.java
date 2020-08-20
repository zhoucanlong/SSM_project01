package com.zhou.bean;

public class Course {
	private String courseNum;
	private String courseName;
	private int courseCredit;
	private int courseTime;
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}
	public int getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(int courseTime) {
		this.courseTime = courseTime;
	}
	@Override
	public String toString() {
		return "Course [courseNum=" + courseNum + ", courseName=" + courseName
				+ ", courseCredit=" + courseCredit + ", courseTime="
				+ courseTime + "]";
	}
	public Course(String courseNum, String courseName, int courseCredit,
			int courseTime) {
		super();
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.courseCredit = courseCredit;
		this.courseTime = courseTime;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
