package com.zhou.bean;

public class UserTeacherBi {
	
	private String courseNum;
	private String courseName;
	private String classNum;
	private String stuName;
	private String stuNum;
	private int score;
	private int courseCredit;
	private int term;
	
	public UserTeacherBi(String courseNum, String courseName, String classNum,
			String stuName, String stuNum, int score, int courseCredit, int term) {
		super();
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.classNum = classNum;
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.score = score;
		this.courseCredit = courseCredit;
		this.term = term;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
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
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}
	@Override
	public String toString() {
		return "UserTeacherBi [courseNum=" + courseNum + ", courseName="
				+ courseName + ", classNum=" + classNum + ", stuName="
				+ stuName + ", score=" + score + ", courseCredit="
				+ courseCredit + ", term=" + term + "]";
	}
	public UserTeacherBi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
