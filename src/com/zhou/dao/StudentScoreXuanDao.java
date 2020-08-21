package com.zhou.dao;

import java.util.List;

import com.zhou.bean.StudentScoreXuan;

public interface StudentScoreXuanDao {
	
	//获取部分信息
	public List<StudentScoreXuan> getSSXByNum(StudentScoreXuan studentScoreXuan);
	
	//获取全部信息
	public List<StudentScoreXuan> getAll();
	
	//增加信息
	public int addSSX(StudentScoreXuan studentScoreXuan);
	
	//删除信息
	public int deleteSSX(StudentScoreXuan studentScoreXuan);
	
	//修改信息
	public int updateSSX(StudentScoreXuan studentScoreXuan);
	
}
