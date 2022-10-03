<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템</title>
</head>
<body>
<h1>서적관리시스템 Ver0.3</h1>
<hr>
<h2>로그인</h2>
<form method="post" action="./member_dao.jsp">
	<br>아이디 : <input type="text" name="member_id" size="30">
	<br>비밀번호 : <input type="password" name="member_pw" size="30">
	<br><input type="hidden" name="actionType" value="L">
	<br><input type="submit" value="확인">
</form>
<ul>
	<li><a href="./member_c.jsp">회원가입</a>
</ul>
</body>
</html>