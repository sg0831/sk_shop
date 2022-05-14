<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="jsp_modules/header.jspf" %>



<% int signUp_success = 0;
if (request.getAttribute("signUp_success") != null) {
	signUp_success = (int)request.getAttribute("signUp_success");
} %>

<script>
	if (<%= signUp_success %> === -1) {
		alert("회원가입 정보가 올바르지 않습니다.");
	}
</script>






<h2>회원가입</h2>
<form action="signUp.shop" method="post">
	<label for="user_id">아이디 : </label>
	<input type="text" name="user_id" id="user_id" />
	<label for="user_pw">비밀번호 : </label>
	<input type="text" name="user_pw" id="user_pw" />
	<label for="user_name">이름 : </label>
	<input type="text" name="user_name" id="user_name" />
	<label for="email">이메일 : </label>
	<input type="text" name="email" id="email" />
	<label for="phone_number">휴대전화 번호 : </label>
	<input type="text" name="phone_number" id="phone_number" />
	<label for="address">주소 : </label>
	<input type="text" name="address" id="address" />
	
	<input type="submit" value="작성 완료" />
</form>


<%@ include file="jsp_modules/footer.jspf" %>