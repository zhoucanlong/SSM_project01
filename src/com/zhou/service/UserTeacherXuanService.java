package com.zhou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserTeacherBi;

public interface UserTeacherXuanService {
	//��ȡȫ��ѧ����Ϣ
	public List<UserTeacherBi> getAllUTX(String teacherNum);
	
	//��ȡ����ѧ����Ϣ
	public List<UserTeacherBi> getUTXByNum(UserTeacherBi userTeacherBi,String teacherNum);
	
	//����ѧ���ɼ�
	public int updateScore(UserTeacherBi userTeacherBi,String teacherNum);
	
	
}
