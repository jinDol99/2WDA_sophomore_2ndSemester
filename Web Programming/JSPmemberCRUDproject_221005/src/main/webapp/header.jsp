<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" 
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" 
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" 
	crossorigin="anonymous">
</head>
<body>

<%
	if( session.isNew()){
		session.setAttribute("loginState", "logout");
		session.setAttribute("userid", null);
		session.setAttribute("userpw", null);
	}
%>

<!-- 부트스트랩으로 새로 작성중인 곳 -->
<!-- 참고: https://getbootstrap.com/docs/4.6/components/navbar/ -->
<!-- 참고: https://getbootstrap.com/docs/4.6/components/dropdowns/#accessibility -->

<!--  
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
  <a class="navbar-brand" href="#">
    <img src="/member01/images/yju_logo_01.png" class="d-inline-block" alt="">
    <h2>회원관리 시스템 V0.1</h2>
  </a>
  <div class="alert alert-primary" role="alert">
	  <form>
		  <div class="row">
		  	<div class="col">
		  		<label for="idForm" >아이디</label>
		  	</div>
		    <div class="col">
		    	<input type="text" class="form-control form-control-sm" id="idForm">
		    </div>
		  </div>
		  
		  <div class="row">
		  	<div class="col">
		  		<label for="pwForm">비밀번호</label>
		  	</div>
		    <div class="col">
		    	<input type="password" class="form-control form-control-sm" id="pwForm">
		    </div>
		  </div>
		  <button type="submit" class="btn btn-primary">로그인</button>
		  <button type="submit" class="btn btn-primary">회원가입</button>
		</form>
	</div>
</nav>
-->
<!-- 1차 완성본 -->



<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
  <a class="navbar-brand">
    <img src="/member01/images/yju_logo_01.png" class="d-inline-block" alt="">
    <img src="/member01/images/system_logo_01.png" class="d-inline-block" alt="">
  </a>
  
<%
	if(session.getAttribute("loginState").equals("login")){
%>
	
	<div class="alert alert-primary" role="alert">
		<form name="logout" method="post" action="/member01/mem_models/member_dao.jsp">
			<div class = "row" >
				<div class="col" display="flex" align-items="center"><%=session.getAttribute("userid")%>님 반가워요!</div>
				<div class="col">
				<input type="hidden" name="actionType" value="LOGOUT">
			 	<button type="submit" class="btn btn-primary">로그아웃</button>
				</div>
				
			</div>
		</form>
	</div>
<%
	}
	else{
%>		 
  
	<div class="alert alert-primary" role="alert">
	  <form name="login" method="post" action="/member01/mem_models/member_dao.jsp">
		  <div class="row">
		  	<div class="col">
		  		<label for="idForm" >아이디</label>
		  	</div>
		    <div class="col">
		    	<input type="text" class="form-control form-control-sm" id="idForm" name="userid">
		    </div>
		  </div>
		  
		  <div class="row">
		  	<div class="col">
		  		<label for="pwForm">비밀번호</label>
		  	</div>
		    <div class="col">
		    	<input type="password" class="form-control form-control-sm" id="pwForm" name="passwd">
		    </div>
		  </div>
		  <input type="hidden" name="actionType" value="LOGIN">
		  <button type="submit" class="btn btn-primary">로그인</button>
		  <button type="submit" class="btn btn-primary">회원가입</button>
		</form>
	</div>
	
<%
		if(session.getAttribute("loginState").equals("errorID")){
			out.print("[사용자ID오류]");
		}
		
		if(session.getAttribute("loginState").equals("errorPW")){
			out.print("[사용자PW오류]");
		}
	}
%>
</nav>

<!-- <nav class = "navbar navbar-expand-lg navbar-light bg-light">
	<img src="/member01/images/yju_logo_01.png"/>
	<div>
		<form class = "form-inline">
		<div class = "form-group">
			<label for="id">아이디: </label>
			<input class= "form-control mr-sm-2" type = "text">
		</div>
		<div class = "form-group">
			<label for="pw">비밀번호: </label>
			<input class= "form-control mr-sm-2" type = "password">
		</div>
		<button type="submit" class="btn btn-primary">로그인</button>
		<button type="submit" class="btn btn-primary">회원가입</button>	
	</form>
	</div>
</nav>-->

<!-- 여기까지 작성중 -->

<!--  
<table>
 <tr>
	 <td><img src="/member01/images/yju_logo_01.png"/></td> 
	 <td width="400" align="center"><h1>회원관리 시스템 V0.1</h1></td> 
	 <td>
<%
		if(session.getAttribute("loginState").equals("login")){
%>
		<%=session.getAttribute("userid")%>님 로그인중.
		<form name="logout" method="post" action="/member01/mem_models/member_dao.jsp">
		  <input type="hidden" name="actionType" value="LOGOUT">
		  <input type="submit" value="로그아웃">
		</form> 
<%
		}
		else{
%>		 
		 <form name="login" method="post" action="/member01/mem_models/member_dao.jsp">
		    아이디 : <input type="text" name="userid" size="10"><br>
		    비밀번호 : <input type="password" name="passwd" size="10"><br>
		    <input type="hidden" name="actionType" value="LOGIN">
		    <input type="submit" value="로그인">
		 </form>
		 <form name="register" method="post" action="/member01/mem_models/member_dao.jsp">
		 <input type="hidden" name="actionType" value="REGISTER">
		    <input type="submit" value="회원가입">
		 </form>
<%
			if(session.getAttribute("loginState").equals("errorID")){
				out.print("[사용자ID오류]");
			}
			
			if(session.getAttribute("loginState").equals("errorPW")){
				out.print("[사용자PW오류]");
			}
		}
%>		
	 </td>
 </tr>
</table> -->
<%
		if(session.getAttribute("loginState").equals("login")){
%>
			<%@ include file= "/GNB.jsp" %>
<%
		}
%>
<hr> 
</body>
</html>