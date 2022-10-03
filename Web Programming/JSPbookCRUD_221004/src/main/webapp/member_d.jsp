<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 회원정보 삭제</title>
</head>
<body>
<h1>서적관리시스템 - 회원 정보 삭제(D)</h1>
<hr>
<h3>삭제 전 본인 확인용 정보를 입력하세요.</h3>

<form method="post" action="./member_d.jsp">
	<br>아이디 : <input type="text" name="member_id" size="30">
	<br>비밀번호 : <input type="password" name="member_pw" size="30">
<!--   	<br><input type="hidden" name="actionType" value="D">	 -->
	<br><input type="submit" value="확인">
</form>

<%
	String driverName = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost/book_db";
	String user = "root";
	String passwd = "root";
	
	Class.forName(driverName);
	Connection con = DriverManager.getConnection(url, user, passwd);
	Statement stmt = con.createStatement();
	request.setCharacterEncoding("UTF-8");
	
	String getId;
	String getPw;
	String sql;
	String member_id = request.getParameter("member_id");
	String member_pw = request.getParameter("member_pw");
	
	sql = "SELECT member_id, member_pw FROM member WHERE member_id = '" + session.getAttribute("member_id") + "';";
	ResultSet rs = stmt.executeQuery(sql);
	System.out.println(sql);
	
	while (rs.next()) {
		getId = rs.getString("member_id");
		getPw = rs.getString("member_pw");
		
		System.out.println("\n getId: " + getId);
		System.out.println("getPw: " + getPw);
		System.out.println("폼에 입력된 member_id: " + member_id);
		System.out.println("폼에 입력된 member_pw: " + member_pw);

		if ((getId.equals(member_id)) && (getPw.equals(member_pw))) {
			System.out.println("입력된 값 일치: member_dao.jsp의 delete부분 이동");
%>			
		<form method="post" action="./member_dao.jsp">
			<p> 정말 회원 탈퇴를 진행하시겠습니까?
 			<br><input type="hidden" name="actionType" value="D">
 			<br><input type="submit" value="확인">
		</form>
<%
		} else {
			System.out.println("정보가 올바르지 않습니다.");
		}
	}
	
	
%>

<br><a href="./book_main.jsp">돌아가기</a>
</body>
</html>