package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {


	//private UserDao userDao = new UserDaoImpl();

	private UserDao userDao;

	//����ʹ��һ��Set�ӿ�ʵ�֣�
	//����set���ж�̬ʵ��ֵ��ע�룡
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getUser() {
		userDao.getUser();
	}
}
