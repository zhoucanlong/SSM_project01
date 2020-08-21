package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.Student;
import com.zhou.bean.StudentScoreBi;
import com.zhou.dao.StudentDao;
import com.zhou.dao.StudentScoreBiDao;
import com.zhou.service.StudentScoreBiService;

@Service
public class StudentScoreBiServiceImpl implements StudentScoreBiService {


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
	public List<StudentScoreBi> getSSBByNum(StudentScoreBi studentScoreBi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentScoreBiDao studentScoreBiDao=sqlSession.getMapper(StudentScoreBiDao.class);
		List<StudentScoreBi> studentScoreBis=studentScoreBiDao.getSSBByNum(studentScoreBi);
		System.out.println(studentScoreBis);
		sqlSession.close();
		return studentScoreBis;
	}

	@Override
	public List<StudentScoreBi> getAllSSB() {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentScoreBiDao studentScoreBiDao=sqlSession.getMapper(StudentScoreBiDao.class);
		List<StudentScoreBi> studentScoreBis=studentScoreBiDao.getAllSSB();
		System.out.println(studentScoreBis);
		sqlSession.close();
		return studentScoreBis;
	}

	@Override
	public int addSSB(StudentScoreBi studentScoreBi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentScoreBiDao studentScoreBiDao=sqlSession.getMapper(StudentScoreBiDao.class);
		int result=studentScoreBiDao.addSSB(studentScoreBi);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteSSB(StudentScoreBi studentScoreBi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentScoreBiDao studentScoreBiDao=sqlSession.getMapper(StudentScoreBiDao.class);
		int result=studentScoreBiDao.deleteSSB(studentScoreBi);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateSSB(StudentScoreBi studentScoreBi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentScoreBiDao studentScoreBiDao=sqlSession.getMapper(StudentScoreBiDao.class);
		int result=studentScoreBiDao.updateSSB(studentScoreBi);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

}
