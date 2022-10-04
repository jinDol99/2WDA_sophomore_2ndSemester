<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String driverName = "org.mariadb.jdbc.Driver";
	String url = "jdbc:mariadb://localhost/member_db";
	String user = "root";
	String passwd = "root";
	
	Class.forName(driverName);
	Connection con = DriverManager.getConnection(url, user, passwd);
	Statement stmt = con.createStatement();
	request.setCharacterEncoding("utf-8");

	int mem_num;
	String mem_name;
	String mem_id;
	String mem_passwd;
	String mem_email;
	String mem_contact;
	String mem_RRN;
	// sql 결과로 나온 레코드의 값들을 저장할 변수
	
	String userID;
	String userPW;
	// header.jsp 폼에서 가져온 아이디 비번 값
	
	String getID;
	String getPW;
	// DB에서 가져온 아이디 비번 값
	
	String sql;
	
    String actionType = request.getParameter("actionType");

	
	
	String userID_DUMMY = "kdhong";
	String userPW_DUMMY = "1234";
	
	int loginState;

	switch( actionType){
		case "CREATE":
			System.out.println("\n-------[member_dao.jsp - actionType: CREATE]---------\n");
			
			mem_name = request.getParameter("mem_name");
			mem_id = request.getParameter("mem_id");
			mem_passwd = request.getParameter("mem_passwd");
			mem_email = request.getParameter("mem_email");
			mem_contact = request.getParameter("mem_contact");
			mem_RRN = request.getParameter("mem_RRN");
			
			sql = "INSERT INTO member (mem_name, mem_id, mem_passwd, mem_email, mem_contact, mem_RRN) VALUES ('";
			sql += mem_name + "', '"  + mem_id + "', '" + mem_passwd + "','" + mem_email + "','" + mem_contact + "','" + mem_RRN + "');";
			
			System.out.println(sql);
			
			int result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				System.out.println("[member_dao.jsp] 레코드 추가 성공");
				out.println("<script>");
			    out.println("alert('회원가입에 성공하였습니다.');");	// alert가 왜 안되냐 진짜;;;;;;;
			    out.println("</script>");
			} else {
				System.out.println("[member_dao.jsp] 레코드 추가 실패");
			}
			
			session.setAttribute("loginState", "logout");
			
			break;
	
		case "LOGIN":
			System.out.println("\n-------[member_dao.jsp - actionType: LOGIN]---------\n");
			
			userID = request.getParameter("userid");
		    userPW = request.getParameter("passwd");
		    System.out.println("[member_dao.jsp] userID: " + userID);
		    System.out.println("[member_dao.jsp] userPW: " + userPW);
		    
		    
		    sql = "SELECT mem_id, mem_passwd FROM member WHERE mem_id = '" + userID + "';";
		    ResultSet rs = stmt.executeQuery(sql);
		    System.out.println("[member_dao.jsp] sql: " + sql);
		    
		    while (rs.next()) {
				getID = rs.getString("mem_id");
				getPW = rs.getString("mem_passwd");
				
				System.out.println("[member_dao.jsp] getId: " + getID);
				System.out.println("[member_dao.jsp] getPw: " + getPW);
				
				if( userID.equals(getID)){
			    	if( userPW.equals(getPW)){
			    		session.setAttribute("loginState", "login");
			    		session.setAttribute("userid", userID);
			    		session.setAttribute("userpw", userPW);
			    		System.out.println("[member_dao.jsp] session userid:" + session.getAttribute("userid"));
			    		System.out.println("로그인 처리 완료");
			    	}else{
			    		session.setAttribute("loginState", "errorPW");
			    	}
			    }else{
			    	session.setAttribute("loginState", "errorID");
			    }
			}
		    break;
		    
		case "LOGOUT":
			System.out.println("\n-------[member_dao.jsp - actionType: LOGOUT]---------\n");
			
			session.setAttribute("userid", null);
			session.setAttribute("userpw", null);
			session.setAttribute("loginState", "logout");
			
			System.out.println("[member_dao.jsp] session userid:" + session.getAttribute("userid"));
			System.out.println("로그아웃 처리 완료");
			break;
			
		case "REGISTER":
			System.out.println("\n-------[member_dao.jsp - actionType: REGISTER]---------\n");
			
			session.setAttribute("loginState", "register");
			break;
		
		default:
			break;
	}
%>

<jsp:forward page="../index.jsp"/>

</body>
</html>