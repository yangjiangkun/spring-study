package com.kuang.demo01;

public class Client {

	public static void main(String[] args) {
		//����Ҫ�ⷿ��
		Host host = new Host();
//		host.rent();

		//�����н�﷿���ⷿ�ӣ������أ������һ�����һЩ����������
		Proxy proxy = new Proxy(host);

		//�㲻����Է�����ֱ�����н��ⷿ���ɣ�
		proxy.rent();

	}




}
