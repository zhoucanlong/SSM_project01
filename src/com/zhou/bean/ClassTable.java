package com.zhou.bean;

public class ClassTable {
	private String classNum;
	private String className;
	private String classYear;
	private int classCount;
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassYear() {
		return classYear;
	}
	public void setClassYear(String classYear) {
		this.classYear = classYear;
	}
	public int getClassCount() {
		return classCount;
	}
	public void setClassCount(int classCount) {
		this.classCount = classCount;
	}
	@Override
	public String toString() {
		return "Class [classNum=" + classNum + ", className=" + className
				+ ", classYear=" + classYear + ", classCount=" + classCount
				+ "]";
	}
	public ClassTable(String classNum, String className, String classYear,
			int classCount) {
		super();
		this.classNum = classNum;
		this.className = className;
		this.classYear = classYear;
		this.classCount = classCount;
	}
	public ClassTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
