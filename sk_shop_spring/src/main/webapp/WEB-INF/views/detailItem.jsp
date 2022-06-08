<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%@ include file="jsp_modules/header.jspf" %>


<h2>상품 상세 정보</h2>

<span>상품 코드 : ${ detailItem.item_code }</span><br/>
<span>상품명 : ${ detailItem.item_name }</span><br/>
<span>상품 가격 : ${ detailItem.price }</span><br/>
<span>색상 : ${ detailItem.color }</span><br/>
<span>사이즈 : ${ detailItem.item_size }</span><br/>
<span>상품 잔량 : ${ detailItem.item_count }</span><br/>
<span>상품 구매수 : ${ detailItem.buyed_count }</span>

<a href="/newOrder?item_code=${ detailItem.item_code }">주문하기</a>

<%@ include file="jsp_modules/footer.jspf" %>