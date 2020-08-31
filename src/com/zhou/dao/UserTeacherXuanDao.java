package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserTeacherBi;

public interface UserTeacherXuanDao {
	
	//获取全部学生信息
	public List<UserTeacherBi> getAllUTX(String teacherNum);
	
	//获取部分学生信息
	public List<UserTeacherBi> getUTXByNum(@Param("utb")UserTeacherBi userTeacherBi,@Param("teacherNum")String teacherNum);
	
	//更新学生成绩
	public int updateScore(@Param("utb")UserTeacherBi userTeacherBi,@Param("teacherNum")String teacherNum);
}
