<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
입력하신 숫자까지의 합 : 
<%
	String num = request.getParameter("num");
	int max = Integer.parseInt(num);
	int sum=0;
	for(int i=1 ; i <= max; i++){
		sum+=i;
	}
	out.print(sum); //화면출력 1
%>
<%-- <%=sum %> <!-- 화면출력 2 --> --%>
</body>
</html>