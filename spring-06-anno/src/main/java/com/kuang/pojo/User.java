package com.kuang.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//�ȼ���<bean id="user" class="com.kuang.pojo.User"/>
//@Component ���
@Component
@Scope("prototype")
public class User {

//	//�൱��<property name="name" value="kuangshen"/>
//	@Value("kuangshen")
	public String name;

	//�൱��<property name="name" value="kuangshen"/>
	@Value("kuangshen")
	public void setName(String name) {
		this.name = name;
	}
}
