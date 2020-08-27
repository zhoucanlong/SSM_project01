package com.zhou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserStudentXuan;

public interface UserStudentXuanService {
	//查询所有选修课的信息
	public List<UserStudentXuan> getAllUSX(@Param("stuNum")String stuNum);
	
	//查询部分选修课的信息
	public List<UserStudentXuan> getUSXByNum(@Param("stuNum")String stuNum,UserStudentXuan userStudentXuan);
	
}
