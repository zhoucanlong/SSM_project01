package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.zhou.bean.Course;
import com.zhou.bean.Student;
import com.zhou.dao.CourseDao;
import com.zhou.dao.StudentDao;
import com.zhou.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

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
	public Course getCourseByNum(Course course) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		CourseDao courseDao=sqlSession.getMapper(CourseDao.class);
		Course course2=courseDao.getCourseByNum(course);
		System.out.println(course2);
		sqlSession.close();
		return course2;
	}

	@Override
	public List<Course> getAllCourse() {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		CourseDao courseDao=sqlSession.getMapper(CourseDao.class);
		List<Course> courses=courseDao.getAllCourse();
		System.out.println(courses);
		sqlSession.close();
		return courses;
	}

	@Override
	public int addCourse(Course course) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CourseDao courseDao=sqlSession.getMapper(CourseDao.class);
		int result=courseDao.addCourse(course);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteCourse(Course course) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CourseDao courseDao=sqlSession.getMapper(CourseDao.class);
		int result=courseDao.deleteCourse(course);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateCourse(Course course) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		CourseDao courseDao=sqlSession.getMapper(CourseDao.class);
		int result=courseDao.updateCourse(course);
		System.out.println(result);
		sqlSession.close();
		return result;
	}

}
