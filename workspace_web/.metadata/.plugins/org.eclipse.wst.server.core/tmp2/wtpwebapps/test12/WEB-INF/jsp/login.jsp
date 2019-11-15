<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = (String)session.getAttribute("id");
    if(id!=null){
    	response.sendRedirect("main.do");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/login.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$(".btn_login").click(function(){
		var id = $("#id").val();
		var pwd = $("#pwd").val();
		
		if(id==""){
			alert("아이디를 입력하세요");
			$("#id").focus();
			return;
		}
		if(pwd==""){
			alert("패스워드를 입력하세요");
			$("#pwd").focus();
			return;
		}
		
		document.login_form.submit();
			
	});
	
});

</script>

</head>
<body>
  <div class="wrapper">
    <form name="login_form" class="form-signin" action="<%=request.getContextPath() %>/LoginController" method="post">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="text" class="form-control" id="id" name="id" placeholder="Email Address"/>
      <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Password"/> 
      <br>     
      <%
      	String msg = (String)request.getAttribute("msg");
      	if(msg!=null){
      %>
      	<div style="color:red;"><%=msg %></div>
      <%
      	}
      %>
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      	<a href="<%=request.getContextPath() %>/signup.do" style="text-align: right;">sign up</a>
      </label>
      <button class="btn btn-lg btn-primary btn-block btn_login" type="button">Login</button>   
    </form>
  </div>
</body>
</html>