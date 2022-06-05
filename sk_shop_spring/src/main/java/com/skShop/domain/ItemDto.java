package com.skShop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
	private String item_code;
	private String item_name;
	private int price;
	private String color;
	private String item_size;
	private int item_count;
	private String category;
	private String item_img;
	private String upload_date;
	private int buyed_count;
}
