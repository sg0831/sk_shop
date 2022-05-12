package model;

import java.util.Objects;

public class ShopItemDTO {
	private String item_code;
	private String item_name;
	private int price;
	private String color;
	private String item_size;
	private int item_count;
	private String category;
	@Override
	public String toString() {
		return "ShopItemDTO [item_code=" + item_code + ", item_name=" + item_name + ", price=" + price + ", color="
				+ color + ", item_size=" + item_size + ", item_count=" + item_count + ", category=" + category + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, color, item_code, item_count, item_name, item_size, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopItemDTO other = (ShopItemDTO) obj;
		return Objects.equals(category, other.category) && Objects.equals(color, other.color)
				&& Objects.equals(item_code, other.item_code) && item_count == other.item_count
				&& Objects.equals(item_name, other.item_name) && Objects.equals(item_size, other.item_size)
				&& price == other.price;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getItem_size() {
		return item_size;
	}
	public void setItem_size(String item_size) {
		this.item_size = item_size;
	}
	public int getItem_count() {
		return item_count;
	}
	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
