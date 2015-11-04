package com.zyfy.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zyfy.test.entity.UserEntity;
import com.zyfy.test.mapping.UserMapper;
import com.zyfy.test.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public UserEntity getUserEntityById(String userId) {
		// TODO Auto-generated method stub
		return this.userMapper.getUserEntityById(userId);
	}

	public List<UserEntity> getUserEntities() {
		// TODO Auto-generated method stub
		return this.userMapper.getUserEntities();
	}

	public UserEntity insertUserEntity(UserEntity userEntity) {
		// TODO Auto-generated method stub
		this.userMapper.insertUser(userEntity);
		return getUserEntityById(userEntity.getUserId());
	}

}
