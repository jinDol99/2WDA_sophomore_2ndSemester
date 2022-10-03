<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 회원조회</title>
</head>
<body>
<h1>서적관리시스템 - 회원 정보 조회(R)</h1>
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
%>

<%
	System.out.println("\n세션에 있는 member_id 값: " + session.getAttribute("member_id"));
	
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
		<ul>
			<li> 회원번호: <%=member_code%>
			<li> 회원명: <%=member_name%>
			<li> 회원 아이디: <%=member_id%>
			<li> 회원 이메일: <%=member_email%>
			<li> 회원 연락처: <%=member_contact%>
			<li> 회원 주민번호: <%=member_RRN%>
		</ul>
<%
	}
%>

<br><a href="./book_main.jsp">홈으로 돌아가기</a>
</body>
</html>