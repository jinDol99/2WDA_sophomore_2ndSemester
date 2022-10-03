<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 회원가입</title>
</head>
<body>

<h1>회원가입</h1>
<hr>
<form method="post" action="./member_dao.jsp">
	<br>회원명 : <input type="text" name="member_name" size="30">
	<br>아이디 : <input type="text" name="member_id" size="30">
	<br>비밀번호 : <input type="password" name="member_pw" size="30">
	<br>이메일 : <input type="text" name="member_email" size="30">
	<br>연락처 : <input type="text" name="member_contact" size="30">
	<br>주민번호 : <input type="password" name="member_RRN" size="30">
	<br><input type="hidden" name="actionType" value="C">
	<br><input type="submit" value="저장">
	<input type="button" value="취소" onClick="location.href='./index.jsp'">
</form>
<!-- button에 현재 탭에서 다른 링크를 걸고 싶다면 onClick 속성으로 -->
<!-- 값을 "location.href=' ... ' 형식으로 입력함면 됨.-->

</body>
</html>