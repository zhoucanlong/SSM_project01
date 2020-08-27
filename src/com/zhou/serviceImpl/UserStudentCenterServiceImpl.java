package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.UserStudentCenter;
import com.zhou.dao.UserStudentBiDao;
import com.zhou.dao.UserStudentCenterDao;
import com.zhou.service.UserStudentCenterService;

@Service
public class UserStudentCenterServiceImpl implements UserStudentCenterService {

	SqlSessionFactory sqlSessionFactory=null;
	
	public void init(){
		//1.����ȫ�������ļ�������һ��SqlSessionFactory
				String resource = "mybatis-config.xml";
				InputStream inputStream=null;
				try {
					inputStream = Resources.getResourceAsStream(resource);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//SqlSessionFactory���Ự����
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	
	@Override
	public List<UserStudentCenter> getAllUSC() {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserStudentCenterDao userStudentCenterDao=sqlSession.getMapper(UserStudentCenterDao.class);
		List<UserStudentCenter> userStudentCenters=userStudentCenterDao.getAllUSC();
		sqlSession.close();
		return userStudentCenters;
	}

	@Override
	public List<UserStudentCenter> getUSCByNum(
			UserStudentCenter userStudentCenter) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserStudentCenterDao userStudentCenterDao=sqlSession.getMapper(UserStudentCenterDao.class);
		List<UserStudentCenter> userStudentCenters=userStudentCenterDao.getUSCByNum(userStudentCenter);
		sqlSession.close();
		return userStudentCenters;
	}


	@Override
	public Integer addCourse(UserStudentCenter userStudentCenter,String stuNum) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserStudentCenterDao userStudentCenterDao=sqlSession.getMapper(UserStudentCenterDao.class);
		//����ctsxuan��
		String courseNum=userStudentCenter.getCourseNum();
		String teacherNum=userStudentCenter.getTeacherNum();
		//ctsis=�γ̺�+��ʦ��+ѧ��
		String ctsid=courseNum+teacherNum+stuNum;
		System.out.println("ctsid:"+ctsid);
		Integer resultA=userStudentCenterDao.addCtsxuan(ctsid, courseNum, teacherNum, stuNum);
		
		//����ssx��
		int term=userStudentCenter.getTerm();
		int score=0;
		Integer resultB=userStudentCenterDao.addSSX(ctsid, score, term);
		sqlSession.close();
		return resultA;
	}

}
