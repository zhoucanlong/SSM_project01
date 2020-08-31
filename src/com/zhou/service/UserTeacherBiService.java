package com.zhou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserTeacherBi;

public interface UserTeacherBiService {
	
	//��ȡ������Ϣ
	public List<UserTeacherBi> getAllUTB(@Param("teacherNum")String teacherNum);
	
	//���ݲ���������ѯ��ʦ���̰༶ѧ���ĳɼ�
	public List<UserTeacherBi> getUTBByNum(@Param("teacherNum")String teacherNum,@Param("utb")UserTeacherBi userTeacherBi);
	
	//�޸�ѧ���ɼ�
	public int updateStudentScore(@Param("utb")UserTeacherBi userTeacherBi);
}
