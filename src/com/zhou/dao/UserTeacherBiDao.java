package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserTeacherBi;

public interface UserTeacherBiDao {
	
	//获取所有信息
	public List<UserTeacherBi> getAllUTB(@Param("teacherNum")String teacherNum);
	
	//根据部分条件查询教师所教班级学生的成绩
	public List<UserTeacherBi> getUTBByNum(@Param("teacherNum")String teacherNum,@Param("utb")UserTeacherBi userTeacherBi);
	
	//添加学生成绩
	public int updateStudentScore(@Param("utb")UserTeacherBi userTeacherBi);
}
