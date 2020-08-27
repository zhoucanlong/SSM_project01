package com.zhou.bean;

public class UserStudentXuan {
	
	private String courseNum;
	private String courseName;
	private String teacherName;
	private int score;
	private int courseCredit;
	private int term;
	public UserStudentXuan(String courseNum, String courseName,
			String teacherName, int score, int courseCredit, int term) {
		super();
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.score = score;
		this.courseCredit = courseCredit;
		this.term = term;
	}
	public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	@Override
	public String toString() {
		return "UserStudentXuan [courseNum=" + courseNum + ", courseName="
				+ courseName + ", teacherName=" + teacherName + ", score="
				+ score + ", courseCredit=" + courseCredit + ", term=" + term
				+ "]";
	}
	public UserStudentXuan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
