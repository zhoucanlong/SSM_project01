package com.zhou.bean;

public class Ctsxuan {
	
	private String ctsid;
	private String courseNum;
	private String teacherNum;
	private String stuNum;
	
	public Ctsxuan(String ctsid, String courseNum, String teacherNum,
			String stuNum) {
		super();
		this.ctsid = ctsid;
		this.courseNum = courseNum;
		this.teacherNum = teacherNum;
		this.stuNum = stuNum;
	}
	public String getCtsid() {
		return ctsid;
	}
	public void setCtsid(String ctsid) {
		this.ctsid = ctsid;
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
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	@Override
	public String toString() {
		return "Ctsxuan [ctsid=" + ctsid + ", courseNum=" + courseNum
				+ ", teacherNum=" + teacherNum + ", stuNum=" + stuNum + "]";
	}
	public Ctsxuan(String courseNum, String teacherNum, String stuNum) {
		super();
		this.courseNum = courseNum;
		this.teacherNum = teacherNum;
		this.stuNum = stuNum;
	}
	public Ctsxuan() {
		super();
		// TODO Auto-generated constructor stub
	}
}
