package com.zhou.dao;

import java.util.List;

import com.zhou.bean.Ctsxuan;

public interface CtsxuanDao {
	
	//��ȡ���е�cts��Ϣ
	public List<Ctsxuan> getAllCtsxuan();
	
	//��ȡ����cts��Ϣ
	public List<Ctsxuan> getCtsxuanByNum(Ctsxuan ctsxuan);
	
	//����cts��Ϣ
	public int addCtsxuan(Ctsxuan ctsxuan);
	
	//ɾ��cts��Ϣ
	public int deleteCtsxuan(Ctsxuan ctsxuan);
	
	//�޸�cts��Ϣ
	public int updateCtsxuan(Ctsxuan ctsxuan);
}
