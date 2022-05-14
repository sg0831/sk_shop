<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="jsp_modules/header.jspf" %>


<h2>상품 등록</h2>
<form action="/create_item.shop" method="post">
	<label for="item_code">아이템 코드</label>
	<input type="text" id="item_code" name="item_code" />
	<label for="item_name">아이템 이름</label>
	<input type="text" id="item_name" name="item_name" />
	<label for="price">가격 : </label>
	<input type="text" name="price" id="price" />
	<label for="color">색상 : </label>
	<input type="text" name="color" id="color" />
	<label for="item_size">사이즈 : </label>
	<input type="text" name="item_size" id="item_size" />
	<label for="item_count">수량 : </label>
	<input type="text" name="item_count" id="item_count" />
	<label for="category">카테고리 : </label>
	<input type="text" name="category" id="category" />
	
	<input type="submit" />
</form>

<%@ include file="jsp_modules/footer.jspf" %>