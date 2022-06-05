package com.skShop.mapper;

import java.util.List;


import com.skShop.domain.UserDto;

public interface UserMapper {
	void insert(UserDto newUser);
	List<UserDto> selectAll();
	UserDto selectOne(String user_id);
	void update(UserDto updateUser);
	void delete(String user_id);
}
