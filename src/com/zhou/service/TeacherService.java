package com.zhou.service;

import java.util.List;

import com.zhou.bean.Teacher;

public interface TeacherService {
	
	
	//��ȡ���ֽ�ʦ��Ϣ
	public List<Teacher> getTeacherByNumOrPro(Teacher teacher);
	
	//��ȡ���н�ʦ��Ϣ
	public List<Teacher> getAllTeacher();
	
	//���ӽ�ʦ��Ϣ
	public int addTeacher(Teacher teacher);
	
	//ɾ����ʦ��Ϣ
	public int deleteTeacher(Teacher teacher);
	
	//�޸Ľ�ʦ��Ϣ
	public int updateTeacher(Teacher teacher);
	
}
