package com.kccistc.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SiteServlet")
public class SiteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String site = request.getParameter("site");
		
		
		if(site.equals("google")) {
			response.sendRedirect("http://www.google.com");
		}else if(site.equals("naver")) {
			response.sendRedirect("http://www.naver.com");
		}else if(site.equals("daum")) {
			response.sendRedirect("http://www.daum.net");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
