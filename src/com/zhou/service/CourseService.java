package com.zhou.service;

import java.util.List;

import com.zhou.bean.Course;

public interface CourseService {

	
	//��ȡĳ���γ̵���Ϣ
	public Course getCourseByNum(Course course);
	
	//��ȡ���пγ���Ϣ
	public List<Course> getAllCourse();
	
	//���ӵ����γ���Ϣ
	public int addCourse(Course course);
	
	//ɾ�������γ���Ϣ
	public int deleteCourse(Course course);
	
	//�޸ĵ����γ���Ϣ
	public int updateCourse(Course course);
}
