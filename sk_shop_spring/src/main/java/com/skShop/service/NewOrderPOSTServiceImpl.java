package com.skShop.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.domain.OrderDto;
import com.skShop.domain.UserDto;
import com.skShop.mapper.OrderMapper;
import com.skShop.serviceInterface.NewOrderPOSTService;

@Service
public class NewOrderPOSTServiceImpl implements NewOrderPOSTService {
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public void service(HttpServletRequest req, Model model) {
		OrderDto newOrder = new OrderDto();
		UserDto login_user = (UserDto)(req.getSession().getAttribute("login_user"));
		
		
		newOrder.setUser_id( login_user.getUser_id() );
		newOrder.setItem_code( req.getParameter("item_code") );
		newOrder.setOrder_count( Integer.parseInt(req.getParameter("order_count")) );
		newOrder.setOrderer_name( req.getParameter("orderer_name") );
		newOrder.setOrderer_phone_number( req.getParameter("orderer_phone_number") );
		newOrder.setOrderer_address( req.getParameter("orderer_address") );
		
		System.out.println("newOrder test : " + newOrder);
		
		orderMapper.insert(newOrder);
	}

}
