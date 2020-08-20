package com.zhou.dao;

import java.util.List;

import com.zhou.bean.Student;

public interface StudentDao {
	//获取单个学生信息
	public List<Student> getStudentByStuNum(Student student);

	//获取所有学生的信息
	public List<Student> getAllStudent();
	
	//插入学生信息
	public int addStudent(Student student);
	
	//修改学生信息
	public int updateStudent(Student student);
	
	//删除学生信息
	public int deleteStudent(String stuNum);
}
