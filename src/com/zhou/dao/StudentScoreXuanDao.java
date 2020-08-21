package com.zhou.dao;

import java.util.List;

import com.zhou.bean.StudentScoreXuan;

public interface StudentScoreXuanDao {
	
	//��ȡ������Ϣ
	public List<StudentScoreXuan> getSSXByNum(StudentScoreXuan studentScoreXuan);
	
	//��ȡȫ����Ϣ
	public List<StudentScoreXuan> getAll();
	
	//������Ϣ
	public int addSSX(StudentScoreXuan studentScoreXuan);
	
	//ɾ����Ϣ
	public int deleteSSX(StudentScoreXuan studentScoreXuan);
	
	//�޸���Ϣ
	public int updateSSX(StudentScoreXuan studentScoreXuan);
	
}
