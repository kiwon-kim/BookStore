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

//@WebServlet("/MembersSelectAllController")
public class MembersSelectAllController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = MemberDAO.getInstance();
		ArrayList<MemberVO> list = dao.selectAll();
		
		request.setAttribute("mlist", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("members.do");
		rd.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
