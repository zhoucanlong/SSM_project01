package com.zhou.bean;

public class Ctcbi {
	private String ctcid;
	private String courseNum;
	private String teacherNum;
	private String classNum;
	public String getCtcid() {
		return ctcid;
	}
	public void setCtcid(String ctcid) {
		this.ctcid = ctcid;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public String getTeacherNum() {
		return teacherNum;
	}
	public void setTeacherNum(String teacherNum) {
		this.teacherNum = teacherNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	@Override
	public String toString() {
		return "Ctcbi [ctcid=" + ctcid + ", courseNum=" + courseNum
				+ ", teacherNum=" + teacherNum + ", classNum=" + classNum + "]";
	}
	public Ctcbi(String ctcid, String courseNum, String teacherNum,
			String classNum) {
		super();
		this.ctcid = ctcid;
		this.courseNum = courseNum;
		this.teacherNum = teacherNum;
		this.classNum = classNum;
	}
	public Ctcbi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
