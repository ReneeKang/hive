package com.spring.miniproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.miniproject.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public int getCount() {
		return userDao.getCount();
	}

}
