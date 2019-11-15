<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Site2Servlet" method="get">
		<input type="radio" name="site" value="google">구글
		<input type="radio" name="site" value="naver">네이버
		<input type="radio" name="site" value="daum">다음
		<input type="submit" value="이동">
	</form>
</body>
</html>