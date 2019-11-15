package com.kccistc.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/test")
public class TestServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 접속");
		//?id=admin
		String id = request.getParameter("id");
		//&password=1234
		String pwd = request.getParameter("password");
		/*
		<!DOCTYPE html>
		<html>
			<head>
				<meta charset="UTF-8">
				<title>test</title>
			</head>
			<body>
				hello web project
				웹프로그래밍에 오신걸 환영합니다.
			</body>
		</html>
		*/
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>test</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>"+id+"님 환영합니다.</h1>");
		out.print("<h1>password : "+pwd+"</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
		/*
		 	get 방식
		 	 - 접속방법 : url을 직접 입력, form method="get", a태그
		 	 - 사용이유 : 빠르다
		 	 - 상용방법 : url을 직접 입력
		 	   (http://localhost:9090/test_web_project/TEST?id=admin&pwd=1234)
		 	 - 속도가 빠름, 보안에 취약
		 */
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 접속");
		/*
		 	post 방식
		 	 - 접속방법 : form method="post"
		 	 - 사용이유 : 보안에 뛰어나다.
		 	 - 사용방법 : form method="post" 
		 	  (http://localhost:9090/test_web_project/TEST)
		 	   //id=admin, pwd=1234
		 	 - 속도가 느림, 보안에 뛰어남
		 */
		
		//?id=admin
//		String charset = getInitParameter("charset");
		String charset = getServletContext().getInitParameter("charset");
		
		request.setCharacterEncoding(charset);
		String id = request.getParameter("id");
		//&password=1234
		String pwd = request.getParameter("password");
		System.out.println("id : "+id);
		System.out.println("pwd : "+pwd);
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>test</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>"+id+"님 환영합니다.</h1>");
		out.print("<h1>password : "+pwd+"</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	}

}
