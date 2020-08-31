package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.UserTeacherBi;
import com.zhou.dao.UserStudentCenterDao;
import com.zhou.dao.UserTeacherBiDao;
import com.zhou.service.UserTeacherBiService;

@Service
public class UserTeacherBiServiceImpl implements UserTeacherBiService {

	SqlSessionFactory sqlSessionFactory=null;
	
	public void init(){
		//1.根据全局配置文件创建出一个SqlSessionFactory
				String resource = "mybatis-config.xml";
				InputStream inputStream=null;
				try {
					inputStream = Resources.getResourceAsStream(resource);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//SqlSessionFactory：会话工厂
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Override
	public List<UserTeacherBi> getAllUTB(String teacherNum) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserTeacherBiDao userTeacherBiDao=sqlSession.getMapper(UserTeacherBiDao.class);
		List<UserTeacherBi> list=userTeacherBiDao.getAllUTB(teacherNum);
		System.out.println(list);
		return list;
	}

	@Override
	public List<UserTeacherBi> getUTBByNum(String teacherNum,
			UserTeacherBi userTeacherBi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserTeacherBiDao userTeacherBiDao=sqlSession.getMapper(UserTeacherBiDao.class);
		List<UserTeacherBi> list=userTeacherBiDao.getUTBByNum(teacherNum, userTeacherBi);
		System.out.println(list);
		return list;
	}

	@Override
	public int updateStudentScore(UserTeacherBi userTeacherBi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserTeacherBiDao userTeacherBiDao=sqlSession.getMapper(UserTeacherBiDao.class);
		int result=userTeacherBiDao.updateStudentScore(userTeacherBi);
		System.out.println(result);
		return result;
	}

}
