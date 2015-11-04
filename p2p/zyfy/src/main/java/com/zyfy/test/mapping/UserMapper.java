package com.zyfy.test.mapping;

import java.util.List;

import com.zyfy.test.entity.UserEntity;

public interface UserMapper {
	UserEntity getUserEntityById(String userId);
	
	List<UserEntity> getUserEntities();
	
	int insertUser(UserEntity userEntity);
}
