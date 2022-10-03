<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 수정</title>
</head>
<body>
<h1>서적관리시스템 - 수정(U)</h1>
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
	int book_id;
	String title;
	String publisher;
	String year;
	int price;
	
	String sql = "SELECT * FROM books ORDER BY book_id";
	ResultSet rs = stmt.executeQuery(sql);
	// book_r.jsp와 동일하게 DB의 모든 데이터를 가져와 HTML으로 출력
%>

<table border="1">
	<thead>
		<tr>
			<th>순번</th>
			<th>제목</th>
			<th>출판사</th>
			<th>출판년도</th>
			<th>가격</th>
			<th>수정</th>
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
		// while(rs.next()) - rs.next()는 객체 속에 다음 데이터가 있으면 true, 없으면 false를 반환함.
		// 					  즉, 이 코드는 rs 객체 속에 다음 데이터가 없을 때 까지 무한 반복하는 의미.
%>	
		<tr>
			<td><%=book_id%></td>
			<td><%=title%></td>
			<td><%=publisher%></td>
			<td><%=year%></td>
			<td><%=price%></td>
			<td><a href="./book_u2.jsp?bookid=<%=book_id%>">수정</a></td>
			<!--  bookid 변수에 해당 레코드에 맞는 book_id 값을 저장함과 동시에 URL 링크를 지정 -->
		</tr>
<%
	}
%>
	</tbody>
</table>

<br><a href="./book_main.jsp">홈으로 돌아가기</a>
</body>
</html>