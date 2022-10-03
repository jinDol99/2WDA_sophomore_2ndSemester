<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 회원정보 DB처리</title>
</head>
<body>
<h1>로그인 - 데이터베이스 처리 부분</h1>
<hr>
<%
	System.out.println("\n--------------\n");

	String driverName = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost/book_db";
	String user = "root";
	String passwd = "root";
	
	Class.forName(driverName);
	Connection con = DriverManager.getConnection(url, user, passwd);
	Statement stmt = con.createStatement();
	request.setCharacterEncoding("utf-8");

	
	String actionType = request.getParameter("actionType");
	System.out.println(actionType);
	
	int member_code;
	String member_name;
	String member_id;
	String member_pw;
	String member_email;
	String member_contact;
	String member_RRN;
	String getId, getPw;
	
	String sql;
	int result;
	String msg = "실행결과 : ";
	
	switch (actionType) {
		case "C":
			member_name = request.getParameter("member_name");
			member_id = request.getParameter("member_id");
			member_pw = request.getParameter("member_pw");
			member_email = request.getParameter("member_email");
			member_contact = request.getParameter("member_contact");
			member_RRN = request.getParameter("member_RRN");
			
			
			sql = "INSERT INTO member (member_name, member_id, member_pw, member_email, member_contact, member_RRN) VALUES ";
			sql += "('" + member_name + "', '"  + member_id + "', '" + member_pw + "','" + member_email + "','" + member_contact + "','" + member_RRN + "')";
			
			System.out.println(sql);
			result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("레코드 추가 성공");
				msg += "레코드 추가 성공";
			} else {
				System.out.println("레코드 추가 실패");
				msg += "레코드 추가 실패";
			}
			break;
			
		case "L":
			member_id = request.getParameter("member_id");
			member_pw = request.getParameter("member_pw");
			
			System.out.println("member_id: " + member_id + "\nmember_pw: " + member_pw);
			
			sql = "SELECT member_id, member_pw FROM member WHERE member_id = '" + member_id + "';";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);
			
			while (rs.next()) {
				getId = rs.getString("member_id");
				getPw = rs.getString("member_pw");
				
				System.out.println("getId: " + getId);
				System.out.println("getPw: " + getPw);
				
				
				if ((getId.isEmpty()) || (getPw.isEmpty())) {
					System.out.println("빈칸");
				} else if ((member_id.equals(getId)) && (member_pw.equals(getPw))) {
					System.out.println("로그인 완료");
					session.setAttribute("member_id", member_id);
					response.sendRedirect("./book_main.jsp");					
				} 
			}

			msg += "로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다.";
			
			break;
	
		case "U":
			member_code = Integer.parseInt(request.getParameter("member_code"));
			member_name = request.getParameter("member_name");
			member_id = request.getParameter("member_id");
			member_pw = request.getParameter("member_pw");
			member_email = request.getParameter("member_email");
			member_contact = request.getParameter("member_contact");
			member_RRN = request.getParameter("member_RRN");
			
			sql = "UPDATE member SET member_name = '";
			sql += member_name + "', member_id = '" + member_id + "', member_pw = '" + member_pw + "', member_email = '" + member_email;
			sql += "', member_contact = '" + member_contact + "', member_RRN = '" + member_RRN +"' WHERE member_id = '" + session.getAttribute("member_id") + "'";
			
			System.out.println(sql);
			
			result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("레코드 수정 성공");
%>
				<h3> 안전하게 변경사항을 반영하기 위해 다시 로그인해주세요.  </h3>
<%
				msg += "레코드 수정 성공";
			} else {
				System.out.println("레코드 수정 실패");
				msg += "레코드 수정 실패";
			}						
		
			break;

		case "D":
 			sql = "DELETE FROM member WHERE member_id = '" + session.getAttribute("member_id") + "';";			
 			System.out.println(sql);
 			
 			result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("레코드 삭제 성공");
				session.setAttribute("member_id", null);
				session.setMaxInactiveInterval(0);
				// 세션의 정보를 null값으로 만들고 세션 유지시간을 0으로 처리하여 로그인 정보를 삭제
				
				msg += "레코드 삭제 성공";
			} else {
				System.out.println("레코드 삭제 실패");
				msg += "레코드 삭제 실패";
			}
			break;	
	}

%>

<h2><%=msg%></h2>

<br><a href="./index.jsp">로그인 페이지로 돌아가기</a>
</body>
</html>