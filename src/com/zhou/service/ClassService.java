package com.zhou.service;

import java.util.List;

import com.zhou.bean.ClassTable;

public interface ClassService {
		
	//查询条件班级的信息
	public List<ClassTable> getClassByClassNumOrYear(ClassTable classTable);
	
	//查询所有班级信息
	public List<ClassTable> getAllClass();
	
	//添加班级信息
	public int addClass(ClassTable classTable);
	
	//删除班级信息
	public int deleteClass(ClassTable classTable);
	
	//修改班级信息
	public int updateClass(ClassTable classTable);
}
