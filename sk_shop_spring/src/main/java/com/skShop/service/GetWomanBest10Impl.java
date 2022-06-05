package com.skShop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.domain.ItemDto;
import com.skShop.mapper.ItemMapper;
import com.skShop.serviceInterface.GetWomanBest10;

@Service
public class GetWomanBest10Impl implements GetWomanBest10 {
	
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public void service(HttpServletRequest req, Model model) {
		List<ItemDto> data = itemMapper.selectWomanBestTop10();
		model.addAttribute("womanBest10", data);
	}

}
