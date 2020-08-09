<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page  isELIgnored="false"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>The name is : ${name}</h1>
	<h1>The name is : ${requestScope.name}</h1>
	<h1>The name is : ${requestScope['name']}</h1>
	
	<h1>Equation : ${1+2}</h1>
</body>
</html>