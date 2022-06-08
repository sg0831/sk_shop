<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%@ include file="jsp_modules/header.jspf"%>

<script>
	if (<%= session.getAttribute("login_user") %> == null) {
		window.location = "/signIn";
	}
</script>




<h2>주문하기</h2>

<form action="/newOrder" method="post">
	<!--  상품명 / 상품 code -->
	<label for="item_name" >상품명 : </label>
	<input type="text" id="item_code" name="item_code" value="${ item.item_code }" readonly="readonly" />
	
	<span>상품명 : ${ item.item_name }</span>
	<span>사이즈 : ${ item.item_size }</span>
	
	<!--  선택 수량 -->
	<label for="order_count" >선택 수량 : </label>
	<input type="text" id="order_count" name="order_count" value="1" />
	
	<!--  주문자 정보 -->
	<label for="orderer_id">주문자 아이디 : </label>
	<input type="text" id="orderer_id" name="orderer_id" value="${ user.user_id }" readonly="readonly" />
	
	<label for="orderer_name" >주문자명 : </label>
	<input type="text" id="orderer_name" name="orderer_name" value="${ user.user_name }" />
	
	<!--  주문자 휴대전화 -->
	<label for="orderer_phone_number" >휴대전화 : </label>
	<input type="text" id="orderer_phone_number" name="orderer_phone_number" value="${ user.phone_number }" />
	
	<!--  배송지 -->
	<label for="orderer_address" >배송지 : </label>
	<input type="text" id="orderer_address" name="orderer_address" value="${ user.address }" />
	
	
	
	
	<input type="submit" id="send_order" value="주문하기" />
</form>


<%@ include file="jsp_modules/footer.jspf"%>