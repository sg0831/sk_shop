<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="jsp_modules/header.jspf"%>

<h2 id="today-best">오늘 BEST!</h2>
<div id="today-best-box">
	<div class="left-box">

		<c:forEach var="item" items="${todayBest10}" begin="0" end="4">
			<a href="/detail?item_code=${item.item_code}">
				<div class="item">
					<div class="img-box">
						<img src="${item.item_img}" alt="${item.item_name} 상품 상세 이미지" />
					</div>
					<h3>${ item.item_name }</h3>
					<span class="category">${ item.category }</span> <span
						class="price">${ item.price }원</span>
				</div>
			</a>
		</c:forEach>
	</div>

	<div class="right-box">
		<c:forEach var="item" items="${todayBest10}" begin="5" end="9">
			<a href="/detail?item_code=${item.item_code}">
				<div class="item">
					<div class="img-box">
						<img src="${item.item_img}" alt="${item.item_name} 상품 상세 이미지" />
					</div>
					<h3>${ item.item_name }</h3>
					<span class="category">${ item.category }</span> <span
						class="price">${ item.price }원</span>
				</div>
			</a>
		</c:forEach>
	</div>
</div>



<!--  남자 베스트 10 -->
<div id="man-best">
	<h2>남자 BEST</h2>
	<div id="man-best-box">

		<c:forEach var="manItem" items="${ manBest10 }">
			<a href="/detail?item_code=${manItem.item_code}">
				<div class="item">
					<div class="img-box">
						<img src="" alt="" />
					</div>
					<h3>${ manItem.item_name }</h3>
					<span class="category">${ manItem.category }</span> <span
						class="price">${ manItem.price }</span>
				</div>
			</a>
		</c:forEach>
	</div>
</div>



<!--  여성 베스트 10 -->
<div id="woman-best">
	<h2>여자 BEST</h2>
	<div id="woman-best-box">

		<c:forEach var="womanItem" items="${ womanBest10 }">
			<a href="/detail?item_code=${ womanItem.item_code }">
				<div class="item">
					<div class="img-box">
						<img src="" alt="" />
					</div>
					<h3>${ womanItem.item_name }</h3>
					<span class="category">${ womanItem.category }</span> <span
						class="price">${ womanItem.price }</span>
				</div>
			</a>
		</c:forEach>
	</div>
</div>

<%@ include file="jsp_modules/footer.jspf"%>