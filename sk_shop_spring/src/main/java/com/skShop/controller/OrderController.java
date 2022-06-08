package com.skShop.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.skShop.serviceInterface.NewOrderGETService;
import com.skShop.serviceInterface.NewOrderPOSTService;

@Controller
public class OrderController {
	
	@Autowired
	private NewOrderGETService newOrderGETService;
	@Autowired
	private NewOrderPOSTService newOrderPOSTService;

	@GetMapping("/newOrder")
	public String newOrderGET(HttpServletRequest req, Model model) {
		newOrderGETService.service(req, model);
		return "newOrder";
	}
	
	@PostMapping("/newOrder")
	public String newOrderPOST(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		newOrderPOSTService.service(req, model);
		return "order_result";
	}
}
