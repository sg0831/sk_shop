package com.skShop.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.skShop.serviceInterface.SignInGET;
import com.skShop.serviceInterface.SignInPOST;
import com.skShop.serviceInterface.SignOut;
import com.skShop.serviceInterface.SignUpGET;
import com.skShop.serviceInterface.SignUpPOST;

@Controller
public class AccountController {
	
	@Autowired
	private SignUpGET signUpGET;
	@Autowired
	private SignUpPOST signUpPOST;
	@Autowired
	private SignInGET signInGET;
	@Autowired
	private SignInPOST signInPOST;
	@Autowired
	private SignOut signOut;

	@GetMapping("/signUp")
		public String signUpGet(HttpServletRequest req, Model model) {
		signUpGET.service(req, model);
		
			return "signUp";
		}
	
	@PostMapping("/signUp")
	public String signUpPost(HttpServletRequest req, HttpServletResponse resp, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		signUpPOST.service(req, model);
		
		return "redirect:/";
	}
	
	@GetMapping("/signIn")
	public String signInGet(HttpServletRequest req, Model model) {
		signInGET.service(req, model);
		return "signIn";
	}
	
	@PostMapping("/signIn")
	public void signInPost(HttpServletRequest req, Model model) {
		signInPOST.service(req, model);
	}
	
	@GetMapping("/signOut")
	public String signOut(HttpServletRequest req, Model model) {
		signOut.service(req, model);
		return "redirect:/";
	}
}
