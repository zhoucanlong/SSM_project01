package com.zhou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserStudentXuan;

public interface UserStudentXuanService {
	//��ѯ����ѡ�޿ε���Ϣ
	public List<UserStudentXuan> getAllUSX(@Param("stuNum")String stuNum);
	
	//��ѯ����ѡ�޿ε���Ϣ
	public List<UserStudentXuan> getUSXByNum(@Param("stuNum")String stuNum,UserStudentXuan userStudentXuan);
	
}
