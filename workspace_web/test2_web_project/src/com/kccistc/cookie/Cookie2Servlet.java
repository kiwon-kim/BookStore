package com.kccistc.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie2Servlet")
public class Cookie2Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		PrintWriter out = response.getWriter();
		
		for(int i=0; cookies != null && i < cookies.length ; i++) {
			out.print("<html>");
			out.print("<body>");
			out.print(cookies[i].getName() +" : "+cookies[i].getValue() + "<br>");
			out.print("</body>");
			out.print("</html");
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
