<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ include file="jsp_modules/header.jspf" %>


<h2>주문 완료</h2>

<span>주문번호 : ${ order.order_id }</span>
<span>주문 상품명 : ${ item.item_name }</span>
<span>주문 수량 : ${ order.order_count }</span>
<span>주문자 이름 : ${ order.orderer_name }</span>
<span>주문자 전화번호 : ${ order.orderer_phone_number }</span>
<span>배송지 : ${ order.orderer_address }</span>
<span>주문 일시 : ${ order.order_date }</span>

<a href="/">홈으로</a>


<%@ include file="jsp_modules/footer.jspf" %>