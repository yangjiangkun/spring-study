package com.kuang.demo03;

public class Client {
	public static void main(String[] args) {
		//��ʵ��ɫ
		Host host = new Host();

		//�����ɫ������û��
		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		//ͨ�����ó������ɫ����������Ҫ���õĽӿڶ���
		pih.setRent(host);

		Rent proxy = (Rent) pih.getProxy();//�����proxy���Ƕ�̬���ɵģ����ǲ�û��д

		proxy.rent();
	}

}


