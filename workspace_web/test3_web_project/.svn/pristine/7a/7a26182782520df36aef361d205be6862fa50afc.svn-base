<%@page import="test3_web_project.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="s" class="test3_web_project.StudentVO"/>
<%-- 	<jsp:setProperty name="s" property="name" value='<%=request.getParameter("name") %>' /> --%>
<%-- 	<jsp:setProperty name="s" property="name" value="${param.name }" /> --%>
<%-- 	<jsp:setProperty name="s" property="age" value="13" /> --%>
<%-- 	<jsp:setProperty name="s" property="grade" value="90" /> --%>
<%-- 	<jsp:setProperty name="s" property="studentNum" value="1" /> --%>
	
	<jsp:setProperty name="s" property="*"/>
	
	
	<jsp:getProperty  name="s" property="name"/>
	<jsp:getProperty  name="s" property="age"/>
	<jsp:getProperty  name="s" property="grade"/>
	<jsp:getProperty  name="s" property="studentNum"/>
	
	<%--<%
		StudentVO s = new StudentVO();
		s.setName("홍길동");
		s.getName();
	
	%>--%>

</body>
</html>