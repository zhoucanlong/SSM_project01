package com.zhou.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.zhou.bean.Student;
import com.zhou.dao.StudentDao;
import com.zhou.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
		
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
	public List<Student> getStudentByStuNum(Student student){
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
		List<Student> students=studentDao.getStudentByStuNum(student);
		System.out.println(students);
		sqlSession.close();
		return students;
	}


	@Override
	public List<Student> getAllStudent() {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession();
		StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
		List<Student> students=studentDao.getAllStudent();
		sqlSession.close();
		return students;
	}

	@Override
	public int addStudent(Student student) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
		int result=studentDao.addStudent(student);
		sqlSession.close();
		return result;
	}

	@Override
	public int updateStudent(Student student) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
		int result=studentDao.updateStudent(student);
		sqlSession.close();
		return result;
	}

	@Override
	public int deleteStudent(String stuNum) {
		init();
		//获取sql会话
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
		int result=studentDao.deleteStudent(stuNum);
		sqlSession.close();
		return result;
	}

}
