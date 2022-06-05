package com.skShop.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.domain.UserDto;
import com.skShop.mapper.UserMapper;
import com.skShop.serviceInterface.SignUpPOST;

@Service
public class SignUpPOSTImpl implements SignUpPOST {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void service(HttpServletRequest req, Model model) {
		UserDto user = new UserDto();
				user.setUser_id( req.getParameter("user_id") );
				user.setUser_pw( req.getParameter("user_pw") );
				user.setUser_name( req.getParameter("user_name") );
				user.setEmail( req.getParameter("email") );
				user.setPhone_number( req.getParameter("phone_number") );
				user.setAddress( req.getParameter("address") );

		userMapper.insert(user);
	}

}
