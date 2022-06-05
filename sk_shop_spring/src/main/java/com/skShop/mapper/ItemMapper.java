package com.skShop.mapper;

import java.util.List;

import com.skShop.domain.ItemDto;

public interface ItemMapper {
	void insert(ItemDto newItem);
	List<ItemDto> selectAll();
	List<ItemDto> selectBestTop10();
	List<ItemDto> selectManBestTop10();
	List<ItemDto> selectWomanBestTop10();
	ItemDto selectOne(String item_code);
	void update(ItemDto updateItem);
	void delete(String item_code);
}
