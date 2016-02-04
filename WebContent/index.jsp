<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Server.connection" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form>
		<b>Addition</b><br>
		no1:<input type="text" name="add1">
		no2:<input type ="text" name="add2">
		
		
		<input type="submit" value="add" name="action"><br><br>
		<b>Subtraction</b><br>
		no1:<input type="text" name="sub1">
		no2:<input type ="text" name="sub2">
		<input type="submit" value="sub" name="action"><br><br>
		<b>Shutdown</b><br>
		<input type="submit" value="shutdown" name="action"><br><br>
		<input type="submit" value="reboot" name="action"><br><br>
		<input type="submit" value="clear" name="action"><br><br>
	</form>
	  <jsp:useBean id="connection" scope="page" class="Server.connection">
		 <% 
			 String action = request.getParameter("action");
			 if ("add".equals(action)) {
				 String add1 = request.getParameter("add1");
					String add2 = request.getParameter("add2");
					connection.Addition(add1,add2);
				} else if ("sub".equals(action)) {
					String sub1 = request.getParameter("sub1");
					String sub2 = request.getParameter("sub2");
					connection.Subtraction(sub1,sub2);
				} else if ("clear".equals(action)){
					connection.clearSend();
				} else if ("shutdown".equals(action)){
					connection.Shutdown();
				} else if("reboot".equals(action)){
					connection.Reboot();
				}
			%>

	</jsp:useBean>
</body>
</html>