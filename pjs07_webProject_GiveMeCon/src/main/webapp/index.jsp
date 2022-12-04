<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include file="/globalData.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>마이쇼핑몰(PJS07) ver0.1</h1>
<hr>
<h2>MVC 패턴 적용, DAO, DTO, VD 활용, DBCP/서블릿/스프링 미적용</h2>
<h3>JNDI, DBCP 구성 및 활용</h3>

<ul>
<%-- 	<li><a href="<%= beerViewDir %>/beer_r_drc.jsp">출력레코드갯수조정(R_DRC)</a>
	<li><a href="<%= beerViewDir %>/beer_c.jsp">맥주정보입력(C)</a>
	<li><a href=".getBeerList.be"> 정보조회(R, 페이징기능X)</a>
	<li><a href=".updateBeerListDislay.be">정보수정</a>
	<li><a href=".deleteBeerListDisplay.be">정보삭제</a> --%>
	<li><a href="./db_dbcp_conn_test.jsp">DB 접속 테스트</a>
</ul>
<%-- 
<jsp:forward page="<%=beerViewDir %>/beer_c.jsp"/>

<p>

<br><img src="<%=imgDir %>/dbcp.PNG" width="500"/> --%>
</body>
</html>