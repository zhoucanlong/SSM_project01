package com.zhou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserTeacherBi;

public interface UserTeacherXuanService {
	//获取全部学生信息
	public List<UserTeacherBi> getAllUTX(String teacherNum);
	
	//获取部分学生信息
	public List<UserTeacherBi> getUTXByNum(UserTeacherBi userTeacherBi,String teacherNum);
	
	//更新学生成绩
	public int updateScore(UserTeacherBi userTeacherBi,String teacherNum);
	
	
}
