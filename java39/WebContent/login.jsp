<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%	
    //
    	MemberDAO dao = new MemberDAO();
    	boolean check = dao.read("window", "window");
    	if(check){
    		session.setAttribute("id2", "window");
    	}
    	response.sendRedirect("main.jsp");
    %>
