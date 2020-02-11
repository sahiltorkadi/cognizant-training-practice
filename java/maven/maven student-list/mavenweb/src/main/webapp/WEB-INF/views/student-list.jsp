<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
	<thead>
		<th>NAME</th>
		<th>EMAIL</th>
	</thead>
	<tbody>
		<core:forEach var="student" items="${students}">
			<tr>
				<td>${student.name}</td>
				<td>${student.email}</td>	
				<td><a href="/update?id<c:out value='${student.id}'/>">update</a>
	                <a href="/delete?id<c:out value='${student.id}'/>">delete</a> </td>
			</tr>
		</core:forEach>
	</tbody>
</table>
<a href="/add?id<c:out value='${student.id}'/>">add</a>
</body>
</html>