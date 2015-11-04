package com.zyfy.test.service;

import java.util.List;

import com.zyfy.test.entity.UserEntity;

public interface UserService {

	UserEntity getUserEntityById(String userId);
	
	List<UserEntity> getUserEntities();
	
	UserEntity insertUserEntity(UserEntity userEntity);
}


