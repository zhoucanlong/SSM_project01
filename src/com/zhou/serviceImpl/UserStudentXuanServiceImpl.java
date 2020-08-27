package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.UserStudentXuan;
import com.zhou.dao.UserStudentBiDao;
import com.zhou.dao.UserStudentXuanDao;
import com.zhou.service.UserStudentXuanService;

@Service
public class UserStudentXuanServiceImpl implements UserStudentXuanService {

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
	public List<UserStudentXuan> getAllUSX(String stuNum) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserStudentXuanDao userStudentXuanDao=sqlSession.getMapper(UserStudentXuanDao.class);
		List<UserStudentXuan> userStudentXuans=userStudentXuanDao.getAllUSX(stuNum);
		return userStudentXuans;
	}

	@Override
	public List<UserStudentXuan> getUSXByNum(String stuNum,
			UserStudentXuan userStudentXuan) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserStudentXuanDao userStudentXuanDao=sqlSession.getMapper(UserStudentXuanDao.class);
		List<UserStudentXuan> userStudentXuans=userStudentXuanDao.getUSXByNum(stuNum, userStudentXuan);
		return userStudentXuans;
	}

}
