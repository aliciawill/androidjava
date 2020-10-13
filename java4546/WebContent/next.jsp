<%@page import="page.Pagination"%>
<%@page import="dbcp.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	int page2 = Integer.parseInt(request.getParameter("page"));
	int range = Integer.parseInt(request.getParameter("range"));
//전체 게시글 개수
MemberDAO dao = new MemberDAO();

int listCnt = dao.allCount();

//Pagination 객체생성

Pagination pagination = new Pagination();
pagination.pageInfo(page2, range, listCnt);
%>
</head>
<body>

</body>
</html>