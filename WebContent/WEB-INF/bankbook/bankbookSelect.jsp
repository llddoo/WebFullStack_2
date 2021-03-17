<%@page import="com.iu.s1.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("dto");	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Name : <%=bankBookDTO.getBookName() %></h1>
	<h1>Rate : <%=bankBookDTO.getBookRate() %></h1>
</body>
</html>