<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 조회</title>
</head>
<body>
<h1>서적관리시스템 - 조회(R)</h1>
<hr>
<h2>전체보기(부분조회, 페이징기능 미포함)</h2>

<%
	String driverName = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost/book_db";
	String user = "root";
	String passwd = "root";
	// JDBC에 필요한 각종 값을 미리 지정
	
	Class.forName(driverName);
	Connection con = DriverManager.getConnection(url, user, passwd);
	Statement stmt = con.createStatement();
	request.setCharacterEncoding("UTF-8");
	// DB 연결 그리고 서버를 구현
%>

<%
	int book_id;
	String title;
	String publisher;
	String year;
	int price;
	// DB에서 가져올 데이터를 저장할 변수 생성
	
	String sql = "SELECT * FROM books ORDER BY book_id";
	ResultSet rs = stmt.executeQuery(sql);
	// SQL 문장을 생성해 DB에 적용시켜 나온 결과값을 rs 객체에 저장
%>

<table border="1">
	<thead>
		<tr>
			<th>순번</th>
			<th>제목</th>
			<th>출판사</th>
			<th>출판년도</th>
			<th>가격</th>
		</tr>
	</thead>
	<tbody>
<%
	while (rs.next()) {
		book_id = rs.getInt("book_id");
		title = rs.getString("title");
		publisher = rs.getString("publisher");
		year = rs.getString("year");
		price = rs.getInt("price");
%>	
		<tr>
			<td><%=book_id%></td>
			<td><%=title%></td>
			<td><%=publisher%></td>
			<td><%=year%></td>
			<td><%=price%></td>
		</tr>
		<!-- rs 객체의 데이터를 HTML 테이블 내에 한 열로 출력 -->
		<!-- 이를 rs 객체 속 남은 데이터가 없을 때 까지 반복 -->
<%
	}
%>
	</tbody>
</table>

<br><a href="./book_main.jsp">홈으로 돌아가기</a>
</body>
</html>