package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice{

	//returnValue;����ֵ
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("ִ����"+method.getName()+"���������ؽ��Ϊ��"+returnValue);
	}
}
