<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>action tag 결과 입니다.</h1>
	<% String id = request.getParameter("id");
	
	%>
	<%=id %>
	
</body>
</html>