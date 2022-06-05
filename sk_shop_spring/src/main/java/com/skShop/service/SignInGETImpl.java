package com.skShop.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.serviceInterface.SignInGET;

@Service
public class SignInGETImpl implements SignInGET {

	@Override
	public void service(HttpServletRequest req, Model model) {
		if (model.getAttribute("login_success") == null) {
			model.addAttribute("login_success", 0);
		}
	}

}
