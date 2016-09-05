<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body align="center">
<form method="post" action="log" >
	<h1 >Student Registration form</h1>
	<table border="1" align="center">
		<tr><td><%String ans=(String)session.getAttribute("UpdatedPassword"); %>
		<%if(ans!=null) 
		{ %>
		<%=ans %>
		<%}%></td></tr>
		<tr>
			<td><h3>EMAIL:</h3></td>
			<td> <input type="text" name="em" placeholder="Enter your Name HERE"></td></br>
		</tr>
		<tr>
			<td>PASSWORD</td>
			<td> <input type="password" name="pass" placeholder="Enter your password"></td><br>
		</tr>
		<tr>
			<td> <input type="submit"></td>
		</tr>
	
</table>
</body>
</html>