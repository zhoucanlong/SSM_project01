package com.zhou.service;

import java.util.List;

import com.zhou.bean.StudentScoreBi;
import com.zhou.dao.StudentScoreBiDao;

public interface StudentScoreBiService {
	//��ȡ����ѧ��������Ϣ
	public List<StudentScoreBi> getSSBByNum(StudentScoreBi studentScoreBi);
	
	//��ȡȫ��ѧ����������Ϣ
	public List<StudentScoreBi> getAllSSB();
	
	//���ӵ���ѧ��������Ϣ
	public int addSSB(StudentScoreBi studentScoreBi);
	
	//ɾ������ѧ��������Ϣ
	public int deleteSSB(StudentScoreBi studentScoreBi);
	
	//���µ���ѧ��������Ϣ
	public int updateSSB(StudentScoreBi studentScoreBi);
;
}
