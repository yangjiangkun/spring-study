package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {



	//@Autowired
	//ֱ����������ʹ�ü���! Ҳ������set��ʽ��ʹ��!
   //ʹ��Autowired ���ǿ��Բ��ñ�дSet������,ǰ����������Զ�װ���������IOC(Spring)�����д���,�ҷ�������byname!
	//�����ʾ������Autowired��required����Ϊfalse,˵������������Ϊnull,��������Ϊ��
	@Autowired(required = false)
	private Cat cat;
//	@Autowired                       //���@Autowired�Զ�װ��Ļ����Ƚϸ���,�Զ�װ���޷�ͨ��һ��ע��[@Autowired]��ɵ�ʱ��,���ǿ���
//	@Qualifier(value = "dog222")     //ʹ��@Qualifier(value="xxx")ȥ����@Autowired��ʹ��,ָ��һ��Ψһ��bean����ע��!
	@Resource  //Ĭ��ͨ��byname�ķ�ʽʵ��,����Ҳ�������,��ͨ��byTypeʵ��!����������Ҳ����������,�ͱ���!
   private Dog dog;
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Dog getDog() {
		return dog;
	}

//	public void setDog(Dog dog) {
//		this.dog = dog;
//	}

	@Override
	public String toString() {
		return "People{" +
				"cat=" + cat +
				", dog=" + dog +
				'}';
	}
}
