package com.shop2.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop2.myapp.dto.UserDTO;
import com.shop2.myapp.model.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public void addUser(UserDTO user) throws Exception {
		userMapper.addUser(user);
		
	}
	
	

}
