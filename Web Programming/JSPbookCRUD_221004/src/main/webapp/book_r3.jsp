<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서적관리시스템 - 조회3</title>
</head>
<body>
<h1>서적관리시스템 - 조회(R3)</h1>
<hr>
<h3>전체보기(부분조회 미포함, 페이징기능개선, 출력레코드갯수선택, 세션객체사용안함)</h3>
<hr>
<%
	String driverName = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost/book_db";
	String user = "root";
	String passwd = "root";
	// DB 접속에 필요한 기본 정보 입력
	
	Class.forName(driverName);
	Connection con = DriverManager.getConnection(url, user, passwd);
	Statement stmt = con.createStatement();
	request.setCharacterEncoding("UTF-8");
	// mariaDB와 접속 및 인코딩 설정 등을 설정하여 자바와의 통신 준비
	
	String sql2 = "SELECT count(*) FROM books ";
	ResultSet rs2 = stmt.executeQuery(sql2);
	// books 테이블 레코드의 개수를 반환하는 SQL 문장으로 얻은 값을 저장
	
	int limitCnt = Integer.parseInt(request.getParameter("displayRecordCnt"));
	int recordCnt = 0;
	int pageCnt;
	
	while( rs2.next() ){
		recordCnt = rs2.getInt(1);
	}

	pageCnt = recordCnt/limitCnt;
	
	if( recordCnt%limitCnt != 0)
		pageCnt++;
	
	int book_id;
	String title;
	String publisher;
	String year;
	int price;
	
	int startRecord = 0;
	int currentPageNo;
	
	int startPageNo, endPageNo;
	
	currentPageNo = Integer.parseInt(request.getParameter("currentPageNo"));
	startRecord = currentPageNo * limitCnt;
	
	startPageNo = currentPageNo/10 * 10;
	endPageNo = startPageNo + 10;
	
	if (endPageNo > pageCnt) {
		endPageNo = pageCnt;
	}
	
	String sql = "SELECT * FROM books ORDER BY book_id limit ";
	sql += startRecord + ", " + limitCnt;
	
	ResultSet rs = stmt.executeQuery(sql);
%>

<hr>
<h2>현재 DISPLAY RECORDS NUMBER : <%= limitCnt %></h2>
<hr>
<form method="post" action="./book_r3.jsp">
	디스플레이 레코드수 변경 :
	<select name="displayRecordCnt">
		<option SELECTED value="10">10</option>
		<option value="20">20</option>
		<option value="50">50</option>
		<option value="100">100</option>
	</select>
	<input type="hidden" name="currentPageNo" value="<%=currentPageNo%>">
	<input type="submit" value="확인">
</form>
<br>

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
		while(rs.next()){
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
<%
		}
%>							
		</tbody>
	</table>	
<br>

<a href="./book_r3.jsp?currentPageNo=0&displayRecordCnt=<%=limitCnt%>">[FIRST]</a>	

<%
	if( currentPageNo > 0) {
%>
	<a href="./book_r3.jsp?currentPageNo=<%=(currentPageNo-1)%>&displayRecordCnt=<%=limitCnt%>">[PRE]</a>
<%
	} else {
%>
	[PRE]
<%
	}

	for(int i = startPageNo; i < endPageNo; i++) {
		if (i == currentPageNo) {
%>
			[<%=(i+1)%>]
<%
		} else {
%>
			<a href="./book_r3.jsp?currentPageNo=<%=i%>&displayRecordCnt=<%=limitCnt%>">[<%=(i+1)%>]</a>
<%
		}
	}
%>
<%
	if( currentPageNo < pageCnt - 1) {
%>
	<a href="./book_r3.jsp?currentPageNo=<%=(currentPageNo+1)%>&displayRecordCnt=<%=limitCnt%>">[NXT]</a>
<%
	} else {
%>	
	[NXT]
<%
	}
%>
<a href="./book_r3.jsp?currentPageNo=<%=(pageCnt-1)%>&displayRecordCnt=<%=limitCnt%>">[END]</a>

<br><br><a href="./book_main.jsp">홈으로 돌아가기</a>
</body>
</html>