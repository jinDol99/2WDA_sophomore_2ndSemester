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

<h1>서적관리시스템 - 자료수정(U2)</h1>
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
	
	String sql = "SELECT * FROM books WHERE book_id = ";
	sql += request.getParameter("bookid") ;
	
	ResultSet rs = stmt.executeQuery(sql);
	
	while (rs.next()) {
		// rs 결과를 읽으려면 next() 메서드 호출 후 rs의 데이터를 get 할수 있으며,
		// while(rs.next()) 없이 rs.getInt() 를 사용한다면 null이 반환됨.
		// 참고: https://brocess.tistory.com/108
		book_id = rs.getInt("book_id");
		title = rs.getString("title");
		publisher = rs.getString("publisher");
		year = rs.getString("year");
		price = rs.getInt("price");
%>

<form method="post" action="./book_dao.jsp">
	<br>서적번호(수정불가) : <input type="text" name="book_id" size="30" value="<%=book_id%>" readonly>
	<br>서적명 : <input type="text" name="title" size="30" value="<%=title%>">
	<br>출판사 : <input type="text" name="publisher" size="30" value="<%=publisher%>">
	<br>출판년도 : <input type="text" name="year" size="30" value="<%=year%>">
	<br>가격 : <input type="text" name="price" size="30" value="<%=price%>">
	<br><input type="hidden" name="actionType" value="U">
	<br><input type="submit" value="수정">
	<!-- 수정할 데이터를 입력할 폼 -->
</form>
<%
	}
%>
<br><a href="./book_main.jsp">홈으로 돌아가기</a>

</body>
</html>