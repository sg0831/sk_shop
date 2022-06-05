<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="jsp_modules/header.jspf" %>


<script>
	if ( ${login_success} < 0) {
		alert("로그인 실패!");
	} else if ( ${ login_success } == 1 ) {
		window.location.href = "/";
	}
</script>





<h2>로그인</h2>
<form action="signIn.shop" method="post">
	<label for="user_id">아이디 : </label>
	<input type="text" name="user_id" id="user_id" />
	<label for="user_pw">비밀번호 : </label>
	<input type="text" name="user_pw" id="user_pw" />
	
	<input type="submit" value="로그인" />

	<a href="/signUp.shop">회원가입</a>
</form>


<%@ include file="jsp_modules/footer.jspf" %>