<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id2 = (String)session.getAttribute("id2");
	if(id2 != null){
%>
	<%= id2 %>님 환영합니다.
<%		
	}else{
%>
	손님 환영합니다.
<%} %>
</body>
</html>