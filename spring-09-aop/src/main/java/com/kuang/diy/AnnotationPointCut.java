package com.kuang.diy;


//��ʽ��:ʹ��ע��ķ�ʽʵ��AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //��ע�������һ������
public class AnnotationPointCut {

	@Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
	public void before(){
		System.out.println("=====����ִ��ǰ=====");
	}

	@After("execution(* com.kuang.service.UserServiceImpl.*(..))")
	public void after(){
		System.out.println("=====����ִ�к�=====");
	}

	//�ڻ�����ǿ��,���ǿ��Ը���һ������,��������Ҫ��ȡ��������ĵ�
	@Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
	public void around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("����ǰ");

//		Signature signature = jp.getSignature();//���ǩ��
//		System.out.println("signature:"+signature);

		//ִ�з���
		Object proceed = jp.proceed();

		System.out.println("���ƺ�");

//		System.out.println(proceed);
	}
}
