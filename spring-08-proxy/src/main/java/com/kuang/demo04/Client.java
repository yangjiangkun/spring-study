package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		//��ʵ��ɫ
		UserServiceImpl userService = new UserServiceImpl();
		//�����ɫ��������
		ProxyInvocationHandler pih = new ProxyInvocationHandler();

		pih.setTarget(userService); //����Ҫ����Ķ���

		//��̬���ɴ�����
		UserService proxy = (UserService) pih.getProxy();

		proxy.add();

	}

}
