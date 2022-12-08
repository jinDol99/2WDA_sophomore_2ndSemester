<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="pjs07_mvc_gifti.model.prd.*"%>
<%@ page import="java.util.*"%>
<%-- <%@ include file="/globalData.jsp"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	prdDTO prd;
	ArrayList<prdDTO> prdList;

	prdList = (ArrayList<prdDTO>)request.getAttribute("prdList");
%>

<hr>
<br>
	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>카테고리</th>
				<th>상품 이미지</th>
				<th>사용 마감일</th>
				<th>원가</th>
				<th>판매가</th>
				<th>설명</th>
			</tr>
		</thead>
		<tbody>
<%
	/* for(int i = 0; i < prdList.size(); i++) { */
	for(int i = 1; i <= 3; i++) {
		prd = prdList.get(i);
%>		
			<tr>
				<td><%=prd.getP_name()%></td>
				<td><%=prd.getP_category()%></td>
				<td><%=prd.getP_img()%></td>
				<td><%=prd.getP_limDate()%></td>
				<td><%=prd.getP_orgnPrice()%></td>
				<td><%=prd.getP_salePrice()%></td>
				<td><%=prd.getP_discription()%></td>
			</tr>
<%
	}
%>			
		</tbody>
	</table>
</body>
</html>