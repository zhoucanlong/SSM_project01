package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.Teacher;
import com.zhou.bean.User;
import com.zhou.dao.TeacherDao;
import com.zhou.dao.UserDao;
import com.zhou.service.UserService;

@Service
public class UserServiceImpl implements UserService {
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
	public int regist(User user) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserDao userDao=sqlSession.getMapper(UserDao.class);
		int result=userDao.regist(user);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int exit(String username) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserDao userDao=sqlSession.getMapper(UserDao.class);
		User user=userDao.exit(username);
		int result;
		if(user!=null){
			result =1;
		}else{
			result =0;
		}
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public User login(String username, String password) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserDao userDao=sqlSession.getMapper(UserDao.class);
		User user=userDao.login(username, password);
		return user;
		
	}

}
