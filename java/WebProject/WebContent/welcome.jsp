<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Log in sucessfully</h1>
<h2>Hello : <%
				String uname = request.getParameter("name");
			%>
			<%=uname %>
</h2>
<%
	String str_new = "Hai";
	for(int i=1;i<=5;i++){
%>

	<br/>
	<input type="text" id="txt<%=i%>"/>

<% }  %>

</body>
</html>