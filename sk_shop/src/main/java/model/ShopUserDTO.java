package model;

import java.util.Objects;

public class ShopUserDTO {
	private String user_id;
	private String user_pw;
	private String user_name;
	private String email;
	private String phone_number;
	private String address;
	private String user_permission;
	@Override
	public String toString() {
		return "ShopUserDTO [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + ", email="
				+ email + ", phone_number=" + phone_number + ", address=" + address + ", user_permission="
				+ user_permission + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, email, phone_number, user_id, user_name, user_permission, user_pw);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopUserDTO other = (ShopUserDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(phone_number, other.phone_number) && Objects.equals(user_id, other.user_id)
				&& Objects.equals(user_name, other.user_name) && Objects.equals(user_permission, other.user_permission)
				&& Objects.equals(user_pw, other.user_pw);
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUser_permission() {
		return user_permission;
	}
	public void setUser_permission(String user_permission) {
		this.user_permission = user_permission;
	}
	
}
