package com.zhou.service;

import java.util.List;

import com.zhou.bean.StudentScoreBi;
import com.zhou.dao.StudentScoreBiDao;

public interface StudentScoreBiService {
	//获取部分学生分数信息
	public List<StudentScoreBi> getSSBByNum(StudentScoreBi studentScoreBi);
	
	//获取全部学生分数的信息
	public List<StudentScoreBi> getAllSSB();
	
	//增加单个学生分数信息
	public int addSSB(StudentScoreBi studentScoreBi);
	
	//删除单个学生分数信息
	public int deleteSSB(StudentScoreBi studentScoreBi);
	
	//更新单个学生分数信息
	public int updateSSB(StudentScoreBi studentScoreBi);
;
}
