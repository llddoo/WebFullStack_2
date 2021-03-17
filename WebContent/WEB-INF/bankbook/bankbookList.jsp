<%@page import="com.iu.s1.bankbook.BankBookDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	List<BankBookDTO> ar = (List<BankBookDTO>)request.getAttribute("list");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="./bankbook/bankbookList.do">BankBook</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="./member/memberJoin.do"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="./member/memberLogin.do"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<div class="container">
	<div class="row">
		<h1>BankBook List</h1>
		
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Rate</th>
					<th>Sale</th>
				</tr>
			</thead>
			
			<tbody>
			<% for(int i=0;i<ar.size();i++){ %>
				<tr>
					<td><%=ar.get(i).getBookName() %></td>
					<td><%=ar.get(i).getBookRate() %> </td>
					<td><%=ar.get(i).getBookSale() %> </td>
				</tr>
			<%} %>	
			</tbody>
			
		</table>
		
	
	</div>
</div>
	
</body>
</html>