package com.zhou.service;

import java.util.List;

import com.zhou.bean.UserStudentCenter;

public interface UserStudentCenterService {
	
	//��ѯ���пγ���Ϣ
	public List<UserStudentCenter> getAllUSC();
	
	//������������
	public List<UserStudentCenter> getUSCByNum(UserStudentCenter userStudentCenter);
	
	//����ѡ�ε�����
	public Integer addCourse(UserStudentCenter userStudentCenter,String stuNum);
}
