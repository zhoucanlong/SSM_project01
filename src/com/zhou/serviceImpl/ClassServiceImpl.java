package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.ClassTable;
import com.zhou.bean.Student;
import com.zhou.dao.ClassDao;
import com.zhou.dao.StudentDao;
import com.zhou.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService {

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
	public List<ClassTable> getClassByClassNumOrYear(ClassTable classTable) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		ClassDao classDao=sqlSession.getMapper(ClassDao.class);
		List<ClassTable> classTable2=classDao.getClassByClassNumOrYear(classTable);
		sqlSession.close();
		return classTable2;
	}

	@Override
	public List<ClassTable> getAllClass() {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		ClassDao classDao=sqlSession.getMapper(ClassDao.class);
		List<ClassTable> classTables=classDao.getAllClass();
		sqlSession.close();
		return classTables;
	}

	@Override
	public int addClass(ClassTable classTable) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		ClassDao classDao=sqlSession.getMapper(ClassDao.class);
		int result=classDao.addClass(classTable);
		System.out.println("result:"+result);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteClass(ClassTable classTable) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		ClassDao classDao=sqlSession.getMapper(ClassDao.class);
		int result=classDao.deleteClass(classTable);
		System.out.println("result:"+result);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateClass(ClassTable classTable) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		ClassDao classDao=sqlSession.getMapper(ClassDao.class);
		int result=classDao.updateClass(classTable);
		sqlSession.close();
		return result;
	}

}
