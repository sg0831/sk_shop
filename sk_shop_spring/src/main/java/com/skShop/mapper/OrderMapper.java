package com.skShop.mapper;

import java.util.List;

import com.skShop.domain.OrderDto;

public interface OrderMapper {
	void insert(OrderDto newOrder);
	List<OrderDto> selectAll();
	OrderDto selectOne(int order_id);
	void update(OrderDto updateOrder);
	void delete(int order_id);
}
