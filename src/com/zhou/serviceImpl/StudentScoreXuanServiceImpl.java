package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.StudentScoreBi;
import com.zhou.bean.StudentScoreXuan;
import com.zhou.dao.StudentScoreBiDao;
import com.zhou.dao.StudentScoreXuanDao;
import com.zhou.service.StudentScoreXuanService;

@Service
public class StudentScoreXuanServiceImpl implements StudentScoreXuanService {
	
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
	public List<StudentScoreXuan> getSSXByNum(StudentScoreXuan studentScoreXuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentScoreXuanDao studentScoreXuanDao=sqlSession.getMapper(StudentScoreXuanDao.class);
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanDao.getSSXByNum(studentScoreXuan);
		System.out.println(studentScoreXuans);
		sqlSession.close();
		return studentScoreXuans;
	}

	@Override
	public List<StudentScoreXuan> getAll() {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentScoreXuanDao studentScoreXuanDao=sqlSession.getMapper(StudentScoreXuanDao.class);
		List<StudentScoreXuan> studentScoreXuans=studentScoreXuanDao.getAll();
		System.out.println(studentScoreXuans);
		sqlSession.close();
		return studentScoreXuans;
	}

	@Override
	public int addSSX(StudentScoreXuan studentScoreXuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentScoreXuanDao studentScoreXuanDao=sqlSession.getMapper(StudentScoreXuanDao.class);
		int result=studentScoreXuanDao.addSSX(studentScoreXuan);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteSSX(StudentScoreXuan studentScoreXuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentScoreXuanDao studentScoreXuanDao=sqlSession.getMapper(StudentScoreXuanDao.class);
		int result=studentScoreXuanDao.deleteSSX(studentScoreXuan);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateSSX(StudentScoreXuan studentScoreXuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentScoreXuanDao studentScoreXuanDao=sqlSession.getMapper(StudentScoreXuanDao.class);
		int result=studentScoreXuanDao.updateSSX(studentScoreXuan);
		sqlSession.close();
		return result;
	}

}
