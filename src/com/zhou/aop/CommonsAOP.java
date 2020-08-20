package com.zhou.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonsAOP {
	//��ȡ���ʽ
	@Pointcut("execution(public * com.zhou.serviceImpl.*.*(..))")
	public void MyPoint(){};
	
	@Before(value="MyPoint()")
	public static void logStart(JoinPoint joinPoint){
		//��ȡ��Ŀ�귽������ʱʹ�õĲ���
		Object[] args=joinPoint.getArgs();
		//��ȡ������ǩ��
		Signature signature=joinPoint.getSignature();
		System.out.println("��"+signature.getName()+"��������ʼִ�У��õĲ����б�"+Arrays.asList(args)+"��");
	}
	
	@AfterReturning(value="MyPoint()",returning="result")
	public static void logReturn(JoinPoint joinPoint,Object result) {
		//��ȡ��Ŀ�귽������ʱʹ�õĲ���
		Object[] args=joinPoint.getArgs();
		//��ȡ������ǩ��
		Signature signature=joinPoint.getSignature();
		System.out.println("��"+signature.getName()+"������ִ����ɣ��������ǣ���"+result+"��");		
	}
	
	@AfterThrowing(value="MyPoint()",throwing="exception")
	public static void logException(JoinPoint joinPoint,Exception exception) {
		//��ȡ��Ŀ�귽������ʱʹ�õĲ���
		Object[] args=joinPoint.getArgs();
		//��ȡ������ǩ��
		Signature signature=joinPoint.getSignature();
		System.out.println("��"+signature.getName()+"�������쳣���쳣��Ϣ�ǡ�"+exception+"��");		
	}
	
	@After(value = "MyPoint()")
	public static void logAfter(JoinPoint joinPoint){
		//��ȡ��Ŀ�귽������ʱʹ�õĲ���
		Object[] args=joinPoint.getArgs();
		//��ȡ������ǩ��
		Signature signature=joinPoint.getSignature();
		System.out.println("��"+signature.getName()+"���������أ��õĲ����б�"+Arrays.asList(args)+"��");
	}
	
/*	//����֪ͨ
	@Around("MyPoint()")
	public void myAround(ProceedingJoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		Object proceed=null;
		Object[] object=joinPoint.getArgs();
		try {
			System.out.println("������ǰ��֪ͨ����"+methodName+"������ʼ��");
			//���÷���ԭ��ʵ�ַ���
            proceed=joinPoint.proceed(object);
			System.out.println("�����Ʒ���֪ͨ����"+methodName+"����������ֵ��"+proceed);

		} catch (Throwable e) {
			System.out.println("�������쳣֪ͨ����"+methodName+"�������쳣��Ϣ��"+e);
		}finally{
			System.out.println("�����ƺ���֪ͨ����"+methodName+"������ʼ��");

		}
	}*/
	
}
