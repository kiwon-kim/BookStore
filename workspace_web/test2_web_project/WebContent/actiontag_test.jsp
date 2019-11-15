<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>action tag 시작 입니다.</h1>
	<jsp:forward page="actiontag_result.jsp">
		<jsp:param value="admin" name="id"/>
	</jsp:forward>
	<%--
	<%
		RequestDispatcher rd = request.getRequestDispatcher("actiontag_result.jsp");
		rd.forward(request, response);
		
	%> 
	--%>
</body>
</html>