package com.zhou.dao;

import java.util.List;

import com.zhou.bean.Teacher;

public interface TeacherDao {
	
	//获取部分教师信息
	public List<Teacher> getTeacherByNumOrPro(Teacher teacher);
	
	//获取所有教师信息
	public List<Teacher> getAllTeacher();
	
	//增加教师信息
	public int addTeacher(Teacher teacher);
	
	//删除教师信息
	public int deleteTeacher(Teacher teacher);
	
	//修改教师信息
	public int updateTeacher(Teacher teacher);
	
}
