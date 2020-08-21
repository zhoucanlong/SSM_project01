package com.zhou.dao;

import java.util.List;

import com.zhou.bean.Ctcbi;

public interface CtcbiDao {
	
	//��ȡ����ctcbi��Ϣ
	public List<Ctcbi> getCtcbiByNum(Ctcbi ctcbi);
	
	//��ȡȫ��ctcbi��Ϣ
	public List<Ctcbi> getAllCtcbi();
	
	//����ctcbi��Ϣ
	public int addCtcbi(Ctcbi ctcbi);
	
	//ɾ��ctcbi��Ϣ
	public int deleteCtcbi(Ctcbi ctcbi);
	
	//�޸�ctcbi��Ϣ
	public int updateCtcbi(Ctcbi ctcbi);
	
}
