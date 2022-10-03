<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 회원수정</title>
</head>
<body>
<h1>서적관리시스템 - 회원 정보 수정(u)</h1>
<hr>

<%
	String driverName = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost/book_db";
	String user = "root";
	String passwd = "root";
	
	Class.forName(driverName);
	Connection con = DriverManager.getConnection(url, user, passwd);
	Statement stmt = con.createStatement();
	request.setCharacterEncoding("UTF-8");

	System.out.println("\n--------------\n세션에 있는 member_id 값: " + session.getAttribute("member_id"));
	
	int member_code;
	String member_name;
	String member_id;
	String member_pw;
	String member_email;
	String member_contact;
	String member_RRN;
	
	String sql = "SELECT * FROM member WHERE member_id = '" + session.getAttribute("member_id") + "';";
	ResultSet rs = stmt.executeQuery(sql);

	
	
	while (rs.next()) {
		member_code = rs.getInt("member_code");
		member_name = rs.getString("member_name");
		member_id = rs.getString("member_id");
		member_pw = rs.getString("member_pw");
		member_email = rs.getString("member_email");
		member_contact = rs.getString("member_contact");
		member_RRN = rs.getString("member_RRN");
%>
		<form method="post" action="./member_dao.jsp">
			<br>회원번호(수정불가) : <input type="text" name="member_code" size="30" value="<%=member_code%>" readonly>
			<br>회원명 : <input type="text" name="member_name" size="30" value="<%=member_name%>">
			<br>아이디 : <input type="text" name="member_id" size="30" value="<%=member_id%>">
			<br>비밀번호 : <input type="password" name="member_pw" size="30" value="<%=member_pw%>">
			<br>이메일 : <input type="text" name="member_email" size="30" value="<%=member_email%>">
			<br>연락처 : <input type="text" name="member_contact" size="30" value="<%=member_contact%>">
			<br>주민번호 : <input type="text" name="member_RRN" size="30" value="<%=member_RRN%>">
			<br><input type="hidden" name="actionType" value="U">
			<br><input type="submit" value="수정">
		</form>
<%
	}
%>

<br><a href="./book_main.jsp">홈으로 돌아가기</a>
</body>
</html>