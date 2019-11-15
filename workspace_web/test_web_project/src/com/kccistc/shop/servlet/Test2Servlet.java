package com.kccistc.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Test2Servlet")
public class Test2Servlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String charset = getServletContext().getInitParameter("charset");
		request.setCharacterEncoding(charset);
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
