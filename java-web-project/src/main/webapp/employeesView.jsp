<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 style="text-align: center;">Employees</h1>


	<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${requestScope.employees}" var="employee">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>