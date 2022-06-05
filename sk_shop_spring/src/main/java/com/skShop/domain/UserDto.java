package com.skShop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private String user_id;
	private String user_pw;
	private String user_name;
	private String email;
	private String phone_number;
	private String address;
	private int user_permission;
}
