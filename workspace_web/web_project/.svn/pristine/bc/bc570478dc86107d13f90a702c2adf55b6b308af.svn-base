package com.kccistc.shop.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.kccistc.shop.dbconn.DBConn;
import com.kccistc.shop.member.dao.MemberDAO;
import com.kccistc.shop.member.vo.MemberVO;
import com.kccistc.shop.shopping.vo.ProductVO;

public class ProductDAO {
	private static ProductDAO dao= null;
	
	private ProductDAO() {}
	
	public static ProductDAO getInstance() {
		if(dao==null) {
			dao = new ProductDAO();
		}
		return dao;
	}
	
	public int productInsert(ProductVO pvo) {
		Connection conn = null; //connection 객체 생성
		PreparedStatement pstmt = null;  //SQL 등록, 실행
		int result = 0;
		
		try {
			conn = DBConn.getConnection();
//			private int productNum;
//			private String productName;
//			private int productPrice;
//			private String productDescription;
//			private String productImgPath;							//sql 사용준비
			String sql = "insert into product "
					+ "(productNum, productName, productPrice, productDescription, productImgPath)"
					+ "values(productNum_seq.nextval, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql); //pstmt 사용준비 
			pstmt.setString(1, pvo.getProductName());
			pstmt.setInt(2, pvo.getProductPrice());
			pstmt.setString(3, pvo.getProductDescription());
			pstmt.setString(4, pvo.getProductImgPath());
			
			
			result = pstmt.executeUpdate(); //sql을 실행한 값을 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(pstmt, null, conn);
		}
		
		return result;
		
	}
	
	public ArrayList<ProductVO> productSelectAll() {
		Connection conn = null; //connection 객체 생성
		Statement stmt = null;  //SQL 등록, 실행
		ResultSet rs = null;    //DB 결과값 받을 공간
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement(); //stmt 사용준비 
											//sql 사용준비
			String sql = "select * from product";
			rs = stmt.executeQuery(sql); //sql을 실행한 값을 
										//rs에 담아줌
			while(rs.next()) {
//				private int productNum;
//				private String productName;
//				private int productPrice;
//				private String productDescription;
//				private String productImgPath;
				ProductVO vo = new ProductVO();
				vo.setProductNum(rs.getInt("productNum"));
				vo.setProductName(rs.getString("productName"));
				vo.setProductPrice(rs.getInt("productPrice"));
				vo.setProductDescription(rs.getString("productDescription"));
				vo.setProductImgPath(rs.getString("productImgPath"));
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(stmt, rs, conn);
		}
		
		return list;
		
	}
	
	
	public void close(Statement stmt, ResultSet rs, Connection conn) {
		try {
			if(stmt!=null) {
				stmt.close();
			}
			if(rs !=null) {
				rs.close();
			}
			if(conn !=null) {
				conn.close();
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	
	public void close(PreparedStatement pstmt, ResultSet rs, Connection conn) {
		try {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(rs !=null) {
				rs.close();
			}
			if(conn !=null) {
				conn.close();
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
}
