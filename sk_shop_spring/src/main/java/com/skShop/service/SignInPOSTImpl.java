package com.skShop.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.domain.UserDto;
import com.skShop.mapper.UserMapper;
import com.skShop.serviceInterface.SignInPOST;

@Service
public class SignInPOSTImpl implements SignInPOST {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void service(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		
		String user_id = req.getParameter("user_id");
		String user_pw = req.getParameter("user_pw");
		
		UserDto user = userMapper.selectOne(user_id);
		
		if (user != null) {
			if ( user.getUser_pw().equals(user_pw) ) {
				// 로그인 성공 
				model.addAttribute("login_success", 1);
				// session의 로그인 상태 활성화
				session.setAttribute("is_login", true);
				return ;
			}
		}
		
		// 로그인 실패
		model.addAttribute("login_success", -1);
	}
	
}
