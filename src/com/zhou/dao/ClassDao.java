package com.zhou.dao;

import java.util.List;

import com.zhou.bean.ClassTable;

public interface ClassDao {
	
	//��ѯ�����༶����Ϣ
	public List<ClassTable> getClassByClassNumOrYear(ClassTable classTable);
	
	//��ѯ���а༶��Ϣ
	public List<ClassTable> getAllClass();
	
	//��Ӱ༶��Ϣ
	public int addClass(ClassTable classTable);
	
	//ɾ���༶��Ϣ
	public int deleteClass(ClassTable classTable);
	
	//�޸İ༶��Ϣ
	public int updateClass(ClassTable classTable);
	
	
	
}
