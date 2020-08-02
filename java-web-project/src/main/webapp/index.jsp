<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!-- instance variable  -->
<%! int count=0; %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from JSP</h1>
	
	<%
		for(int i=1;i<=10;i++){
			
	%>
<%-- 		<p>Hello  <% out.print(" " +i); %></p> --%>
			<p>Hello  <%= Integer.toString(i) %></p>
	<%
		}
	%>
	
	
	<h3>Hit count : <%= ++count %></h3>
</body>
</html>