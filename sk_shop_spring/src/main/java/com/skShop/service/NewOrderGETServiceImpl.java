package com.skShop.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.domain.ItemDto;
import com.skShop.domain.UserDto;
import com.skShop.mapper.ItemMapper;
import com.skShop.serviceInterface.NewOrderGETService;


@Service
public class NewOrderGETServiceImpl implements NewOrderGETService {
	
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public void service(HttpServletRequest req, Model model) {
		ItemDto item = itemMapper.selectOne( req.getParameter("item_code") );
		UserDto user = (UserDto)( req.getSession().getAttribute("login_user") );
		
		model.addAttribute("item", item);
		model.addAttribute("user", user);
	}

}
