package com.zhou.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Teacher {
	
	private String teacherNum;
	private String teacherName;
	private String teacherPro;
	private float teacherSalary;
	private int teacherYear;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date teacherBirth;
	public String getTeacherNum() {
		return teacherNum;
	}
	public void setTeacherNum(String teacherNum) {
		this.teacherNum = teacherNum;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPro() {
		return teacherPro;
	}
	public void setTeacherPro(String teacherPro) {
		this.teacherPro = teacherPro;
	}
	public float getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(float teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	public int getTeacherYear() {
		return teacherYear;
	}
	public void setTeacherYear(int teacherYear) {
		this.teacherYear = teacherYear;
	}
	public Date getTeacherBirth() {
		return teacherBirth;
	}
	public void setTeacherBirth(Date teacherBirth) {
		this.teacherBirth = teacherBirth;
	}
	@Override
	public String toString() {
		return "Teacher [teacherNum=" + teacherNum + ", teacherName="
				+ teacherName + ", teacherPro=" + teacherPro
				+ ", teacherSalary=" + teacherSalary + ", teacherYear="
				+ teacherYear + ", teacherBirth=" + teacherBirth + "]";
	}
	public Teacher(String teacherNum, String teacherName, String teacherPro,
			float teacherSalary, int teacherYear, Date teacherBirth) {
		super();
		this.teacherNum = teacherNum;
		this.teacherName = teacherName;
		this.teacherPro = teacherPro;
		this.teacherSalary = teacherSalary;
		this.teacherYear = teacherYear;
		this.teacherBirth = teacherBirth;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
