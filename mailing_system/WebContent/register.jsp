<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#abc").change(function(){
			var em = $("#abc").val();
			alert("hello"+em);
			$.post("ajax",{saf:em},function(response,status){
				
				$("#response").html(response);
			});
		});	
	});

</script>
</head>
<body align="center">
<form method="post" action="reg" >
<h1 >Student Registration form</h1>
<table  align="center">
	<tr>
	<td><h3>NAME:</h3></td>
	<td> <input type="text" name="name" placeholder="Enter your Name HERE"></td>
	<td><% String msg1=(String) request.getAttribute("k1");
	if(msg1!=null) 
	{ %>
	<%=msg1 %>
	<%}%></td></br>
	</tr>
	<tr>
	<td>ENROLLMENT NO:</td>
	<td> <input type="number" name="eno" placeholder="Enter your EN.no HERE"></td><br>
	</tr>
	<tr>
	<td>ADDRESS:</td>
	<td> <input type="text" name="add" placeholder="Enter your add HERE"></td><br>
	</tr>
	<tr>
	<td>MOBILE NO:</td>
	<td> <input type="number" name="mno" placeholder="Enter your Mob.no HERE"></td><br>
	</tr>
	<tr>
	<td>BRANCH:</td>
	 <td><input type="text" name="branch" placeholder="Enter your Branch HERE"></td><br>
	 </tr>
	 <tr>
	 <td>EMAIL: </td>
	<td><input type="text" name="email" placeholder="enter your email id here" id="abc"></td>
	<td><div id="response" ></div></td>
	<td><% String msg2=(String) request.getAttribute("k2");
	 if(msg2!=null) 
	{ %>
	<h3><%=msg2 %></h3>
	<%}%></td><br>
	</tr>
	
	<tr>
	<td>PASSWORD:</td>
	<td><input type="password" name="pass" placeholder="Enter your Password here"></td><br>
	</tr>
	<tr>
	<td>REGISTER:</td> 
	 <td><input type="submit"></td>
	 </tr>
</table>
</form>
</body>
</html>