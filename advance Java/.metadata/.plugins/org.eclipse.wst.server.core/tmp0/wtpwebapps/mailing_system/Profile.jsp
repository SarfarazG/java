<%@page import="org.omg.CORBA.Request"%>
<%@page import="com.saf.mailling.dto.RegDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<h3><a href="EditPass.jsp">Change_Password</a></h3>
<tr><td> <a href="EditProfile.jsp">EDIT_PROFILE</a></td></tr>
<tr><td><% String ans=(String)session.getAttribute("profileupdate"); %>
<%if(ans!=null) 
	{ %>
	<%=ans %>
	<%}%></td></tr>
<%  RegDto rd =(RegDto)session.getAttribute("profile"); %>
<tr><td><h3>NAME:</h3></td> <td> <h3><%=rd.getName() %></h3></td></tr>
<tr><td><h3>EMAIL:</h3></td> <td> <h3><%=rd.getEmail() %></h3></td></tr>
<tr><td><h3>Address:</h3></td> <td> <h3><%=rd.getAddress() %></h3></td></tr>
<tr><td><h3>Mobile:</h3></td> <td> <h3><%=rd.getMobile() %></h3></td></tr>
<tr><td><h3>Branch:</h3></td> <td> <h3><%=rd.getBranch() %></h3></td></tr>
<tr><td><h3>Enrollment:</h3></td> <td> <h3><%=rd.getEno() %></h3></td></tr>
</table>
</body>
</html>