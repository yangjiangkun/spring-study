package com.kuang.demo01;

public class Proxy implements Rent{

	private Host host;

	public Proxy(){

	}

	public Proxy(Host host) {
		this.host = host;
	}

	public void rent() {
		seeHouse();
		host.rent();
		hetong();
		fare();
	}

	//����
	public void seeHouse(){
		System.out.println("�н���㿴��");
	}

	//����
	public void hetong(){
		System.out.println("ǩ���޺�ͬ");
	}

	//���н��
	public void fare(){
		System.out.println("���н��");
	}



}
