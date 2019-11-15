<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--  <% String id = "admin"; %> --%>
 <c:set var="id" value="admin"></c:set>
	
 <c:out value="${id}"/>
 <%if(5>3){%>	 
	출력
 <% } %>

 <c:if test="${5>3 }">
 	출력
 </c:if>
 
 <c:choose>
 	<c:when test="${5>3 }">
 		<h1>숫자 5가 크다</h1>
 	</c:when>
 	<c:otherwise>
 		<h1>숫자 3이 크다</h1>
 	</c:otherwise>
 </c:choose>
 
<%-- <% ArrayList<String> list = new ArrayList<String>();
 	for(String s: list){
 		out.print(s);
 	}
%>--%>
 <c:forEach items="${list}" var="s">
 	${s }
 </c:forEach>
 
<%--  <%for(int i=1; 1<=10 ; i++) %> --%>
 <c:forEach begin="1" end="10" step="1" var="i">
 	${i}
 </c:forEach>
 
 
 
</body>
</html>