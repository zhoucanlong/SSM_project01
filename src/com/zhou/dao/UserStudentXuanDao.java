package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserStudentXuan;

public interface UserStudentXuanDao {
	
	//��ѯ����ѡ�޿ε���Ϣ
	public List<UserStudentXuan> getAllUSX(@Param("stuNum")String stuNum);
	
	//��ѯ����ѡ�޿ε���Ϣ
	public List<UserStudentXuan> getUSXByNum(@Param("stuNum")String stuNum,@Param("usx")UserStudentXuan userStudentXuan);
	
	
}
