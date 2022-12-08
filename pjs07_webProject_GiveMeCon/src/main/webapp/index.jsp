<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/globalData.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<header>
	<div style="background-color: LightSkyBlue">
		<p> 헤더 테스트 </p>
	</div>
</header>
<aside>
	<div style="background-color:LightGreen">
		<ul>
			<li><a href="#">출력레코드갯수조정(R_DRC)</a>
			<li><a href="<%= prdViewDir %>/prd_c.jsp">상품추가</a>
			<li><a href="#">상품수정</a>
			<li><a href="#">상품삭제</a>
			<li><a href="<%= etcViewDir %>/db_dbcp_conn_test.jsp">DB 접속 테스트</a>
		</ul>
	</div>
</aside>
	
<article>
	<div style="background-color: LightYellow">
		<p> 전체상품 출력용 아티클 </p>
	</div>
</article>
<footer>
	<div style="background-color: LightGrey">
		<p> 푸터 테스트 </p>
	</div>
</footer>

<%-- 
<jsp:forward page="<%=beerViewDir %>/beer_c.jsp"/>

<p>

<br><img src="<%=imgDir %>/dbcp.PNG" width="500"/> --%>
</body>
</html>