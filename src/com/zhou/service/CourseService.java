package com.zhou.service;

import java.util.List;

import com.zhou.bean.Course;

public interface CourseService {

	
	//获取某个课程的信息
	public Course getCourseByNum(Course course);
	
	//获取所有课程信息
	public List<Course> getAllCourse();
	
	//增加单个课程信息
	public int addCourse(Course course);
	
	//删除单个课程信息
	public int deleteCourse(Course course);
	
	//修改单个课程信息
	public int updateCourse(Course course);
}
