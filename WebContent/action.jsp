<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
		connection.Addition(sub1,sub2);
	}
	
	%>
</jsp:useBean>
