package com.zhou.service;

import java.util.List;

import com.zhou.bean.StudentScoreXuan;

public interface StudentScoreXuanService {
	
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
