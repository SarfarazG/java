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
<body>
<table>
<tr>
	 <td>EMAIL: </td>
	<td><input type="text" name="email" placeholder="enter your email id here" id="abc"></td><br>
	<td >
	<div id="response" >
	</div>
	</td>
	</tr>
</table>
</body>
</html>