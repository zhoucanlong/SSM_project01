package com.zhou.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhou.bean.UserStudentCenter;

public interface UserStudentCenterDao {

	//��ѯ���пγ���Ϣ
	public List<UserStudentCenter> getAllUSC();
	
	//������������
	public List<UserStudentCenter> getUSCByNum(@Param("usc")UserStudentCenter userStudentCenter);
	
	//����ctsxuan��
	public int addCtsxuan(@Param("ctsid")String ctsid,@Param("courseNum")String courseNum,@Param("teacherNum")String teacherNum,@Param("stuNum")String stuNum);
	
	//����studentscorexuan��
	public int addSSX(@Param("ctsid")String ctsid,@Param("score")int score,@Param("term")int term);
	
}
