<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index of Annotation Test</title>
</head>
<% 
	Enumeration<String> sessionNames = session.getAttributeNames();
%>
<body>
	<h3>Welcome, Annotation Test</h3>
	<p>
		<b>@WebListener Test</b><br>
		<%
			while(sessionNames.hasMoreElements()){
				String sessionKey = sessionNames.nextElement();
		%>
			<%= sessionKey  %> : <%= session.getAttribute(sessionKey) %><br>
		<%
			}
		%>
	</p>
	<a href="http://blog.naver.com/lestat85/220810269602">Annotations frequently used</a>
</body>
</html>