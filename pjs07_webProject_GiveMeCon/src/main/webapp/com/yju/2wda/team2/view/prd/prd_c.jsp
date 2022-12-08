<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/globalData.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<% System.out.println("--------[prd_c.jsp]---------"); %>
<h1>상품 등록</h1>
<hr>
<form method="post" action="./insertPrd.pr">

	<br>상품이름 : <input type="text" name="p_name" size="30">
	<br>상품종류 : <input type="text" name="p_category" size="30">
	<br>상품이미지 : <input type="text" name="p_img" size="30">
	<br>바코드이미지 : <input type="text" name="p_barcode" size="30">
	<br>상품사용기한: <input type="text" name="p_limDate" size="30">
	<br>정가 : <input type="text" name="p_orgnPrice" size="30">
	<br>판매희망가 : <input type="text" name="p_salePrice" size="30">
	<br>설명 : <input type="text" name="p_description" size="30">
	<br><input type="hidden" name="actionType" value="C">
	<br><input type="submit" value="저장">
</form>

<br><a href="<%= rootDir %>/index.jsp">홈으로 돌아가기</a>
<button onclick="history.back()">뒤로 가기</button>

</body>
</html>