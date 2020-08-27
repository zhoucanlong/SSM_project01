package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserStudentBi;

public interface UserStudentBiDao {
	
	//查看学生全部的信息
	public List<UserStudentBi> getAllUserStudentBi(@Param("stuNum")String stuNum);
	
	//按条件进行查询
	public List<UserStudentBi> getAllUserStudentBiByNum(@Param("stuNum")String stuNum,@Param("usb")UserStudentBi userStudentBi);
	
}
