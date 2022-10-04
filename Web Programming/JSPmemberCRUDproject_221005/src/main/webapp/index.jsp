<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="./header.jsp" %>
<!-- 헤더 파일인 header.jsp를 불러와 그대로 적용시킴 -->
<%
	System.out.println("\n-------[index.jsp]---------\n");
	System.out.println("[index.jsp] session loginState:" + session.getAttribute("loginState"));
	if(session.getAttribute("loginState").equals("login")){
%>
		 <jsp:include page="./login_page.jsp"/>
<%
	}else if (session.getAttribute("loginState").equals("register")){
%>
		<jsp:include page="./register_page.jsp"/>
<%
	}else {
%>
		 <jsp:include page="./logout_page.jsp"/>
<%
	}
	// 세션의 형태. 즉, 로그인의 상태 또는 관리자 여부에 따라
	// body 부분에 보여지게 되는 jsp 파일을 적용시킴.
	// 이 때, <jsp:include ... > 의 키워드를 사용하면
	// 코드 전체가 아닌 출력 결과값만 가져와 적용함.
%>		 
<%@ include file="./footer.jsp" %>
</body>
</html>