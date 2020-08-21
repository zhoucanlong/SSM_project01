package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.Ctcbi;
import com.zhou.bean.Student;
import com.zhou.dao.CtcbiDao;
import com.zhou.dao.StudentDao;
import com.zhou.service.CtcbiService;

@Service
public class CtcbiServiceImpl implements CtcbiService{

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
	public List<Ctcbi> getCtcbiByNum(Ctcbi ctcbi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtcbiDao ctcbiDao=sqlSession.getMapper(CtcbiDao.class);
		List<Ctcbi> ctcbis=ctcbiDao.getCtcbiByNum(ctcbi);
		System.out.println(ctcbis);
		sqlSession.close();
		return ctcbis;
	}

	@Override
	public List<Ctcbi> getAllCtcbi() {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtcbiDao ctcbiDao=sqlSession.getMapper(CtcbiDao.class);
		List<Ctcbi> ctcbis=ctcbiDao.getAllCtcbi();
		System.out.println(ctcbis);
		sqlSession.close();
		return ctcbis;
	}

	@Override
	public int addCtcbi(Ctcbi ctcbi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtcbiDao ctcbiDao=sqlSession.getMapper(CtcbiDao.class);
		int result=ctcbiDao.addCtcbi(ctcbi);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteCtcbi(Ctcbi ctcbi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtcbiDao ctcbiDao=sqlSession.getMapper(CtcbiDao.class);
		int result=ctcbiDao.deleteCtcbi(ctcbi);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateCtcbi(Ctcbi ctcbi) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtcbiDao ctcbiDao=sqlSession.getMapper(CtcbiDao.class);
		int result=ctcbiDao.updateCtcbi(ctcbi);
		System.out.println(result);
		sqlSession.close();
		return result;
	}
	
}
