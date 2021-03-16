<%@page import="com.iu.s1.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String result = (String)request.getAttribute("r");
	MemberDTO memberDTO = (MemberDTO)request.getAttribute("dto");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Result Page</h1>
	<h1><%= result %> </h1>
	
	<% if(memberDTO != null){ %>
	
	<h1>ID : <%=memberDTO.getId() %> </h1>
	<h1>Email : <%=memberDTO.getEmail() %></h1>
	
	<%} %>
</body>
</html>

