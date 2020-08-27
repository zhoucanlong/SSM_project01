package com.zhou.service;

import java.util.List;

import com.zhou.bean.UserStudentCenter;

public interface UserStudentCenterService {
	
	//查询所有课程信息
	public List<UserStudentCenter> getAllUSC();
	
	//按照条件查找
	public List<UserStudentCenter> getUSCByNum(UserStudentCenter userStudentCenter);
	
	//插入选课的数据
	public Integer addCourse(UserStudentCenter userStudentCenter,String stuNum);
}
