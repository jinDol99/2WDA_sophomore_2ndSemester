<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/member01/mem_models/member_dao.jsp">
	<br>회원명 : <input type="text" name="mem_name" size="30">
	<br>아이디 : <input type="text" name="mem_id" size="30">
	<br>비밀번호 : <input type="password" name="mem_passwd" size="30">
	<br>이메일 : <input type="text" name="mem_email" size="30">
	<br>연락처 : <input type="text" name="mem_contact" size="30">
	<br>주민번호 : <input type="password" name="mem_RRN" size="30">
	<br><input type="hidden" name="actionType" value="CREATE">
	<br><input type="submit" value="저장">
</form>
<form name="logout" method="post" action="/member01/mem_models/member_dao.jsp">
	<input type="hidden" name="actionType" value="LOGOUT">
	<input type="submit" value="취소">
</form> 

</body>
</html>