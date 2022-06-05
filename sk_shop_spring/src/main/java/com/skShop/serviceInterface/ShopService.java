package com.skShop.serviceInterface;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface ShopService {
	void service(HttpServletRequest req, Model model);
}
