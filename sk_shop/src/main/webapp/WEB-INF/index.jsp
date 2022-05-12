<%@ include file="jsp_modules/header.jspf" %>

	<h2 id="today-best">오늘 BEST!</h2>
	<div id="today-best-box">
		<div class="left-box">
			<!--  for문으로 왼쪽 5회, 오른쪽 5회 총 10회 반복 필요 -->
			<a href="/detail1.shop">
				<div class="item">
					<div class="img-box"><img src="" alt="" /></div>
					<h3>상품 제목</h3>
					<span class="category">카테고리</span>
					<span class="price">10,000원</span>
				</div>
			</a>
		</div>
	</div>


	<div id="man-best">
		<h2>남자 BEST</h2>
		<div id="man-best-box">
		<!--  for문을 통해 10번 반복 필요 -->
			<a href="/detail1.shop">
				<div class="item">
					<div class="img-box"><img src="" alt="" /></div>
					<h3>상품 제목</h3>
					<span class="category">카테고리</span>
					<span class="price">10,000원</span>
				</div>
			</a>
		</div>
	</div>


	<div id="woman-best">
		<h2>여자 BEST</h2>
		<div id="woman-best-box">
			<!--  for문을 통해 10번 반복 필요 -->
			<a href="/detail1.shop">
				<div class="item">
					<div class="img-box"><img src="" alt="" /></div>
					<h3>상품 제목</h3>
					<span class="category">카테고리</span>
					<span class="price">10,000원</span>
				</div>
			</a>
		</div>
	</div>
	
<%@ include file="jsp_modules/footer.jspf" %>