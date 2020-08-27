package com.zhou.bean;

public class UserStudentCenter {
	
	private String courseNum;
	private String courseName;
	private String teacherName;
	private String teacherNum;
	private int term=0;
	private int courseCredit;
	
	public UserStudentCenter(String courseNum, String courseName,
			String teacherName, String teacherNum, int term, int courseCredit) {
		super();
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.teacherNum = teacherNum;
		this.term = term;
		this.courseCredit = courseCredit;
	}
	public String getTeacherNum() {
		return teacherNum;
	}
	public void setTeacherNum(String teacherNum) {
		this.teacherNum = teacherNum;
	}
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
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}
	@Override
	public String toString() {
		return "UserStudentCenter [courseNum=" + courseNum + ", courseName="
				+ courseName + ", teacherName=" + teacherName + ", teacherNum="
				+ teacherNum + ", term=" + term + ", courseCredit="
				+ courseCredit + "]";
	}
	public UserStudentCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
