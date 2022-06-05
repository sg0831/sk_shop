package com.skShop.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.serviceInterface.SignOut;

@Service
public class SignOutImpl implements SignOut {
	
	@Override
	public void service(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		if (session.getAttribute("is_login") != null) {
			session.setAttribute("is_login", false);
		}
	}
	
}
