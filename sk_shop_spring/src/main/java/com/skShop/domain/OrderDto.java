package com.skShop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * CREATE TABLE shop_orders (
	order_id  number  NOT NULL  PRIMARY KEY,
	user_id  varchar2(20)  NOT NULL,
	item_code  varchar2(20)  NOT NULL,
	order_count  number  DEFAULT 1  NOT NULL,
	orderer_name  varchar2(30)  NOT NULL,
	orderer_phone_number  varchar2(30)  NOT NULL,
	orderer_address  varchar2(500)  NOT NULL,
	order_date  date  default sysdate  NOT NULL
);
 */



@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
	private int order_id;
	private String user_id;
	private String item_code;
	private int order_count;
	private String orderer_name;
	private String orderer_phone_number;
	private String orderer_address;
}
