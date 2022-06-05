package com.skShop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skShop.domain.ItemDto;
import com.skShop.mapper.ItemMapper;


@Controller
public class DetailController {
	
	@Autowired
	private ItemMapper itemMapper;

		@RequestMapping("/detail")
		public String detail(HttpServletRequest req, Model model) {
			String item_code = req.getParameter("item_code");
			ItemDto data = itemMapper.selectOne(item_code);
			
			model.addAttribute("detailItem", data);
			
			return "detailItem";
		}
}
