package com.kccistc.shop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kccistc.shop.member.dao.MemberDAO;
import com.kccistc.shop.member.vo.MemberVO;
import com.kccistc.shop.shopping.dao.ProductDAO;
import com.kccistc.shop.shopping.vo.ProductVO;


public class ShopSelectAllController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO dao = ProductDAO.getInstance();
		ArrayList<ProductVO> list = dao.productSelectAll();
		
		request.setAttribute("plist", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("shop.do");
		rd.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
