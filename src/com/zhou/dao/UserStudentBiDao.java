package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserStudentBi;

public interface UserStudentBiDao {
	
	//�鿴ѧ��ȫ������Ϣ
	public List<UserStudentBi> getAllUserStudentBi(@Param("stuNum")String stuNum);
	
	//���������в�ѯ
	public List<UserStudentBi> getAllUserStudentBiByNum(@Param("stuNum")String stuNum,@Param("usb")UserStudentBi userStudentBi);
	
}
