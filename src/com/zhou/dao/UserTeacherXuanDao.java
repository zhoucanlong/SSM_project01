package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserTeacherBi;

public interface UserTeacherXuanDao {
	
	//��ȡȫ��ѧ����Ϣ
	public List<UserTeacherBi> getAllUTX(String teacherNum);
	
	//��ȡ����ѧ����Ϣ
	public List<UserTeacherBi> getUTXByNum(@Param("utb")UserTeacherBi userTeacherBi,@Param("teacherNum")String teacherNum);
	
	//����ѧ���ɼ�
	public int updateScore(@Param("utb")UserTeacherBi userTeacherBi,@Param("teacherNum")String teacherNum);
}
