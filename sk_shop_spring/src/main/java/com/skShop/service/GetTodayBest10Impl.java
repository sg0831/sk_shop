package com.skShop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.skShop.domain.ItemDto;
import com.skShop.mapper.ItemMapper;
import com.skShop.serviceInterface.GetTodayBest10;

@Service
public class GetTodayBest10Impl implements GetTodayBest10 {
	
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public void service(HttpServletRequest req, Model model) {
		List<ItemDto> data = itemMapper.selectBestTop10();
		model.addAttribute("todayBest10", data );
	}

}
