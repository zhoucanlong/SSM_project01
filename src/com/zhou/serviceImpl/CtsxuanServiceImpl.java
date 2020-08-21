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
import com.zhou.bean.Ctsxuan;
import com.zhou.dao.CtcbiDao;
import com.zhou.dao.CtsxuanDao;
import com.zhou.service.CtsxuanService;

@Service
public class CtsxuanServiceImpl implements CtsxuanService {

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
	public List<Ctsxuan> getAllCtsxuan() {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtsxuanDao ctsxuanDao=sqlSession.getMapper(CtsxuanDao.class);
		List<Ctsxuan> ctsxuans=ctsxuanDao.getAllCtsxuan();
		System.out.println(ctsxuans);
		sqlSession.close();
		return ctsxuans;
	}

	@Override
	public List<Ctsxuan> getCtsxuanByNum(Ctsxuan ctsxuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtsxuanDao ctsxuanDao=sqlSession.getMapper(CtsxuanDao.class);
		List<Ctsxuan> ctsxuans=ctsxuanDao.getCtsxuanByNum(ctsxuan);
		System.out.println(ctsxuans);
		sqlSession.close();
		return ctsxuans;
	}

	@Override
	public int addCtsxuan(Ctsxuan ctsxuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtsxuanDao ctsxuanDao=sqlSession.getMapper(CtsxuanDao.class);
		int result=ctsxuanDao.addCtsxuan(ctsxuan);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteCtsxuan(Ctsxuan ctsxuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtsxuanDao ctsxuanDao=sqlSession.getMapper(CtsxuanDao.class);
		int result=ctsxuanDao.deleteCtsxuan(ctsxuan);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateCtsxuan(Ctsxuan ctsxuan) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CtsxuanDao ctsxuanDao=sqlSession.getMapper(CtsxuanDao.class);
		int result=ctsxuanDao.updateCtsxuan(ctsxuan);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

}
