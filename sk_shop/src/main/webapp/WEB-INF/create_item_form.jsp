<%@ include file="jsp_modules/header.jspf" %>

<form action="/create_item" method="post">
	<label for="item_code">아이템 코드</label>
	<input type="text" id="item_code" name="item_code" />
	<label for="item_name">아이템 이름</label>
	<input type="text" id="item_name" name="item_name" />
	<label for=""></label>
	<input type="text" />
	<label for=""></label>
	<input type="text" />
	<label for=""></label>
	<input type="text" />
	<label for=""></label>
	<input type="text" />
	<label for=""></label>
	<input type="text" />
	
	<input type="submit" />
</form>

<%@ include file="jsp_modules/footer.jspf" %>