package com.zhou.dao;

import java.util.List;

import com.zhou.bean.Student;

public interface StudentDao {
	//��ȡ����ѧ����Ϣ
	public List<Student> getStudentByStuNum(Student student);

	//��ȡ����ѧ������Ϣ
	public List<Student> getAllStudent();
	
	//����ѧ����Ϣ
	public int addStudent(Student student);
	
	//�޸�ѧ����Ϣ
	public int updateStudent(Student student);
	
	//ɾ��ѧ����Ϣ
	public int deleteStudent(String stuNum);
}
