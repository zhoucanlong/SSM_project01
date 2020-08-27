package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserStudentCenter;

public interface UserStudentCenterDao {

	//查询所有课程信息
	public List<UserStudentCenter> getAllUSC();
	
	//按照条件查找
	public List<UserStudentCenter> getUSCByNum(@Param("usc")UserStudentCenter userStudentCenter);
	
	//插入ctsxuan表
	public int addCtsxuan(@Param("ctsid")String ctsid,@Param("courseNum")String courseNum,@Param("teacherNum")String teacherNum,@Param("stuNum")String stuNum);
	
	//插入studentscorexuan表
	public int addSSX(@Param("ctsid")String ctsid,@Param("score")int score,@Param("term")int term);
	
}
