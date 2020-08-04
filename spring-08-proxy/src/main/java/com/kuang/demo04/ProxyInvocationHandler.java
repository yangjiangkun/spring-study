package com.kuang.demo04;

import com.kuang.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//�Ȼ����ǻ�������࣬�Զ����ɴ����࣡
public class ProxyInvocationHandler implements InvocationHandler {

	//������Ľӿ�
	private  Object target;

	public void setTarget(Object target){
		this.target = target;
	}

	//���ɵõ�������
	public Object getProxy(){
		return  Proxy.newProxyInstance(this.getClass().getClassLoader(),
				target.getClass().getInterfaces(),this);
	}

	//�������ʵ���������ؽ��
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		log(method.getName());
		//��̬����ı��ʣ�����ʹ�÷������ʵ��!
		Object result = method.invoke(target,args);
		return result;
	}


	public void log(String msg){
		System.out.println("ִ����"+msg+"����");
	}

}






























