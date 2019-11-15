package com.kccistc.shop.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kccistc.shop.shopping.dao.ProductDAO;
import com.kccistc.shop.shopping.vo.ProductVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

//@WebServlet("/ProductRegistController")
public class ProductRegistController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MultipartRequest multi = null;
		String folder = request.getRealPath("/productImgFolder");
		
		int maxSize=1024*1024*10; //10M
		String charset="utf-8";

		try {
//			System.out.println("출력");
			multi = new MultipartRequest
					(request, folder, maxSize,
					charset, new DefaultFileRenamePolicy());
//			 productName varchar2(20), -->
//			 productPrice number, -->
//			 ProductDescription varchar2(4000), -->
//			 ProductImgPath varchar2(1000), -->	
			
			String productName = multi.getParameter("productName");
			int productPrice = Integer.parseInt(multi.getParameter("productPrice"));
			String productDescription = multi.getParameter("productDescription");
			String productImgPath = "";
			
			Enumeration files = multi.getFileNames();
			File file = null;
			while(files.hasMoreElements()) {
				String filename = (String) files.nextElement();
				file = multi.getFile(filename);
				productImgPath = "productImgFolder\\"+file.getName();
			}
			System.out.println(file.getAbsolutePath());
			
			//file copy
			String copyFolder="C:\\javaprogram\\workspace_web\\web_project\\WebContent\\productImgFolder";
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());
			FileOutputStream fos = new FileOutputStream(copyFolder+"/"+file.getName());
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			byte[] data = new byte[1024];
			int len=0;
			while((len=bis.read(data)) != -1){
				bos.write(data, 0, len);
			}
					
			ProductDAO dao = ProductDAO.getInstance();
			ProductVO pvo = new ProductVO();
			pvo.setProductName(productName);
			pvo.setProductPrice(productPrice);
			pvo.setProductDescription(productDescription);
			pvo.setProductImgPath(productImgPath);
			
			int result = dao.productInsert(pvo);
			if(result == 0) {
				response.sendRedirect("productRegist.do");
			} else {
				response.sendRedirect("ShopSelectAllController");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
