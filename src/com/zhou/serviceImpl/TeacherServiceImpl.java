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
import com.zhou.bean.Teacher;
import com.zhou.dao.StudentDao;
import com.zhou.dao.TeacherDao;
import com.zhou.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

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
	public List<Teacher> getTeacherByNumOrPro(Teacher teacher) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		TeacherDao teacherDao=sqlSession.getMapper(TeacherDao.class);
		List<Teacher> teachers=teacherDao.getTeacherByNumOrPro(teacher);
		System.out.println(teachers);
		sqlSession.close();
		return teachers;
	}

	@Override
	public List<Teacher> getAllTeacher() {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		TeacherDao teacherDao=sqlSession.getMapper(TeacherDao.class);
		List<Teacher> teachers=teacherDao.getAllTeacher();
		System.out.println(teachers);
		sqlSession.close();
		return teachers;
	}

	@Override
	public int addTeacher(Teacher teacher) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		TeacherDao teacherDao=sqlSession.getMapper(TeacherDao.class);
		int result=teacherDao.addTeacher(teacher);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteTeacher(Teacher teacher) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		TeacherDao teacherDao=sqlSession.getMapper(TeacherDao.class);
		int result=teacherDao.deleteTeacher(teacher);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateTeacher(Teacher teacher) {
		init();
		//��ȡsql�Ự
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		TeacherDao teacherDao=sqlSession.getMapper(TeacherDao.class);
		int result=teacherDao.updateTeacher(teacher);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

}
