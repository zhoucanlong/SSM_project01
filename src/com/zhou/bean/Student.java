package com.zhou.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	
	private String stuNum;
	private String stuName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	private String classNum;
	private String sex;
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", stuName=" + stuName
				+ ", birth=" + birth + ", classNum=" + classNum + ", sex="
				+ sex + "]";
	}
	public Student(String stuNum, String stuName, Date birth, String classNum,
			String sex) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.birth = birth;
		this.classNum = classNum;
		this.sex = sex;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
