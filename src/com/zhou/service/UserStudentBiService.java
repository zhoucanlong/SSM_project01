package com.zhou.service;

import java.util.List;

import com.zhou.bean.UserStudentBi;

public interface UserStudentBiService {
	
	
	//查看学生全部的信息
	public List<UserStudentBi> getAllUserStudentBi(String stuNum);
	
	//按条件进行查询
	public List<UserStudentBi> getAllUserStudentBiByNum(UserStudentBi userStudentBi,String stuNum);
	
}
