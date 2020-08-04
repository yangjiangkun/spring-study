package com.kuang.config;

import com.kuang.pojo.User;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//���Ҳ�ᱻSpring�����й�,ע�ᵽ������,��Ϊ����������һ��@Component,
// @Configuration��������һ��������,�ͺ�����֮ǰ������beans.xmlһ��
@Configuration
@ComponentScan("com.kuang.pojo")
@Import(KuangConfig.class)
public class KuangConfig {

	//ע��һ��bean,���൱������֮ǰд��һ��bean��ǩ,
	//�������������,���൱��bean��ǩ�е�id����
	//��������ķ���ֵ,���൱��bean��ǩ�е�class����
	@Bean
	public User getUser(){
		return new User();
	}

}
