package com.zhou.service;

import java.util.List;

import com.zhou.bean.UserStudentBi;

public interface UserStudentBiService {
	
	
	//�鿴ѧ��ȫ������Ϣ
	public List<UserStudentBi> getAllUserStudentBi(String stuNum);
	
	//���������в�ѯ
	public List<UserStudentBi> getAllUserStudentBiByNum(UserStudentBi userStudentBi,String stuNum);
	
}
