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
	//抽取表达式
	@Pointcut("execution(public * com.zhou.serviceImpl.*.*(..))")
	public void MyPoint(){};
	
	@Before(value="MyPoint()")
	public static void logStart(JoinPoint joinPoint){
		//获取到目标方法运行时使用的参数
		Object[] args=joinPoint.getArgs();
		//获取到方法签名
		Signature signature=joinPoint.getSignature();
		System.out.println("【"+signature.getName()+"】方法开始执行，用的参数列表【"+Arrays.asList(args)+"】");
	}
	
	@AfterReturning(value="MyPoint()",returning="result")
	public static void logReturn(JoinPoint joinPoint,Object result) {
		//获取到目标方法运行时使用的参数
		Object[] args=joinPoint.getArgs();
		//获取到方法签名
		Signature signature=joinPoint.getSignature();
		System.out.println("【"+signature.getName()+"】方法执行完成，计算结果是：【"+result+"】");		
	}
	
	@AfterThrowing(value="MyPoint()",throwing="exception")
	public static void logException(JoinPoint joinPoint,Exception exception) {
		//获取到目标方法运行时使用的参数
		Object[] args=joinPoint.getArgs();
		//获取到方法签名
		Signature signature=joinPoint.getSignature();
		System.out.println("【"+signature.getName()+"】出现异常，异常信息是【"+exception+"】");		
	}
	
	@After(value = "MyPoint()")
	public static void logAfter(JoinPoint joinPoint){
		//获取到目标方法运行时使用的参数
		Object[] args=joinPoint.getArgs();
		//获取到方法签名
		Signature signature=joinPoint.getSignature();
		System.out.println("【"+signature.getName()+"】方法返回，用的参数列表【"+Arrays.asList(args)+"】");
	}
	
/*	//环绕通知
	@Around("MyPoint()")
	public void myAround(ProceedingJoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		Object proceed=null;
		Object[] object=joinPoint.getArgs();
		try {
			System.out.println("【环绕前置通知】【"+methodName+"方法开始】");
			//利用反射原理实现方法
            proceed=joinPoint.proceed(object);
			System.out.println("【环绕返回通知】【"+methodName+"方法，返回值】"+proceed);

		} catch (Throwable e) {
			System.out.println("【环绕异常通知】【"+methodName+"方法，异常信息】"+e);
		}finally{
			System.out.println("【环绕后置通知】【"+methodName+"方法开始】");

		}
	}*/
	
}
