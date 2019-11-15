package com.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.book.dbconn.DBConn;
import com.book.vo.BookVO;

public class BookDAO {

	
	private static BookDAO dao= null;
	
	private BookDAO() {}
	
	public static BookDAO getInstance() {
		if(dao==null) {
			dao = new BookDAO();
		}
		return dao;
	}
	
//	 bookNum number,
//	    bookName varchar2(20),
//	    bookPrice number,
//	    bookDescription varchar2(4000),
//	    bookImgPath varchar2(1000),
	
	public ArrayList<BookVO> selectAll() {
		Connection conn = null; //connection 객체 생성
		Statement stmt = null;  //SQL 등록, 실행
		ResultSet rs = null;    //DB 결과값 받을 공간
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement(); //stmt 사용준비 
											//sql 사용준비
			String sql = "select * from book";
			rs = stmt.executeQuery(sql); //sql을 실행한 값을 
										//rs에 담아줌
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookNum(rs.getInt("bookNum"));
				vo.setBookName(rs.getString("bookName"));
				vo.setBookPrice(rs.getInt("bookPrice"));
				vo.setBookDescription(rs.getString("bookDescription"));
				vo.setBookImgPath(rs.getString("bookImgPath"));
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

	public int bookInsert(BookVO bvo) {
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
			String sql = "insert into book "
					+ "(bookNum, bookName, bookPrice, bookDescription, bookImgPath)"
					+ "values(bookNum_seq.nextval, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql); //pstmt 사용준비 
			
			pstmt.setString(1, bvo.getBookName());
			pstmt.setInt(2, bvo.getBookPrice());
			pstmt.setString(3, bvo.getBookDescription());
			pstmt.setString(4, bvo.getBookImgPath());
			
			
			result = pstmt.executeUpdate(); //sql을 실행한 값을 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(pstmt, null, conn);
		}
		
		return result;
	}
	
	public int deleteMember(String bookNum) {
		Connection conn = null; //connection 객체 생성
		PreparedStatement pstmt = null;  //SQL 등록, 실행
		ResultSet rs = null;    //DB 결과값 받을 공간
		int result=0;
		try {
			conn = DBConn.getConnection();
											//sql 사용준비
			String sql = "delete from book "
					+ "where bookNum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookNum);
			result = pstmt.executeUpdate(); //sql을 실행한 값을 
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(pstmt, rs, conn);
		}
		
		return result;
		
	}
	
	
}

