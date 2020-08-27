package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.UserStudentBi;
import com.zhou.dao.TeacherDao;
import com.zhou.dao.UserStudentBiDao;
import com.zhou.service.UserStudentBiService;

@Service
public class UserStudentBiServiceImpl implements UserStudentBiService {
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
	public List<UserStudentBi> getAllUserStudentBi(String stuNum) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserStudentBiDao userStudentBiDao=sqlSession.getMapper(UserStudentBiDao.class);
		List<UserStudentBi> userStudentBis=userStudentBiDao.getAllUserStudentBi(stuNum);
		return userStudentBis;
	}

	@Override
	public List<UserStudentBi> getAllUserStudentBiByNum(
			UserStudentBi userStudentBi,String stuNum) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserStudentBiDao userStudentBiDao=sqlSession.getMapper(UserStudentBiDao.class);
		List<UserStudentBi> userStudentBis=userStudentBiDao.getAllUserStudentBiByNum(stuNum, userStudentBi);
		return userStudentBis;
	}

}
