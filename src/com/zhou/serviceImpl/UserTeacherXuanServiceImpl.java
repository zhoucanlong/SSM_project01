package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.UserTeacherBi;
import com.zhou.dao.UserTeacherBiDao;
import com.zhou.dao.UserTeacherXuanDao;
import com.zhou.service.UserTeacherXuanService;

@Service
public class UserTeacherXuanServiceImpl implements UserTeacherXuanService {

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
	public List<UserTeacherBi> getAllUTX(String teacherNum) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserTeacherXuanDao userTeacherXuanDao=sqlSession.getMapper(UserTeacherXuanDao.class);
		List<UserTeacherBi> list=userTeacherXuanDao.getAllUTX(teacherNum);
		System.out.println(list);
		return list;
	}

	@Override
	public List<UserTeacherBi> getUTXByNum(UserTeacherBi userTeacherBi,
			String teacherNum) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserTeacherXuanDao userTeacherXuanDao=sqlSession.getMapper(UserTeacherXuanDao.class);
		List<UserTeacherBi> list=userTeacherXuanDao.getUTXByNum(userTeacherBi, teacherNum);
		System.out.println(list);
		return list;
	}

	@Override
	public int updateScore(UserTeacherBi userTeacherBi,String teacherNum) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserTeacherXuanDao userTeacherXuanDao=sqlSession.getMapper(UserTeacherXuanDao.class);
		int result=userTeacherXuanDao.updateScore(userTeacherBi, teacherNum);
		System.out.println(result);
		return result;
	}

}
