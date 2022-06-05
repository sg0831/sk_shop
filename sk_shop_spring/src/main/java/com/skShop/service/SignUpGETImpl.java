package com.skShop.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.domain.UserDto;
import com.skShop.mapper.UserMapper;
import com.skShop.serviceInterface.SignUpGET;

@Service
public class SignUpGETImpl implements SignUpGET {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void service(HttpServletRequest req, Model model) {
		List<UserDto> allUserList = userMapper.selectAll();
		ArrayList<String> allUserIdList = new ArrayList<String>();
		
		for (UserDto user : allUserList) {
			allUserIdList.add(user.getUser_id());
		}
		
		model.addAttribute("allUserIdList", allUserIdList);
	}

}
