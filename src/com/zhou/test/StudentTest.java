package com.zhou.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhou.bean.Student;
import com.zhou.service.StudentService;

public class StudentTest {
	
    ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
	StudentService studentService;
	
	
	
	@Test
	public void test() {
/*		studentService=ioc.getBean(StudentService.class);
		Student student=studentService.getStudentByStuNum("20170310331");
		System.out.println(student);*/
	}
	
	
}
