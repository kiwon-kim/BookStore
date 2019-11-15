<%@page import="com.book.vo.BookVO"%>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/members.css">
 <%@ include file="../includes/header.jsp" %>
</head>
<body>
<section>
  <div class="table_wrapper">
  <div class="table">
  
<!--   //	ID	VARCHAR2(30 BYTE) -->
<!-- //	PWD	VARCHAR2(30 BYTE) -->
<!-- //	EMAIL	VARCHAR2(50 BYTE) -->
<!-- //	GENDER	CHAR(1 BYTE) -->
<!-- //	JOINDATE	DATE -->
<!-- //	PHONENUM	VARCHAR2(20 BYTE) -->

    <div class="row header">
      <div class="cell">
        ID
      </div>
      <div class="cell">
        PWD
      </div>
      <div class="cell">
        EMAIL
      </div>
      <div class="cell">
        GENDER
      </div>
      <div class="cell">
        PHONENUM
      </div>
      <div class="cell">
        JOINDATE
      </div>
 
    </div>
   <%-- <%
    	ArrayList<MemberVO> mlist = (ArrayList<MemberVO>)request.getAttribute("mlist");
    	for(int i=0; i < mlist.size() ; i++){
    %> --%>

         <div class="items">

        <c:forEach items="${blist }" var="mvo">
        <!-- single item -->
        <div class="item">
        	<input type="hidden" name="bookNum" value="${mvo.bookNum }">
            <img src="${mvo.bookImgPath }" alt="item" width="200" height="180"/>
             <h2>${mvo.bookName }</h2>

            <p>Price: <em>${mvo.bookPrice }</em>
            </p>
            <button class="add-to-cart" type="button">Add to cart</button>
        </div>
        <!--/ single item -->
        </c:forEach>
        
    </div>
    <!--/ items -->
        
    <c:forEach items="${blist }" var="mvo">
    <div class="row">
      <div class="cell" data-title="Num">
         ${mvo.bookNum }
      </div>
      <div class="cell" data-title="Name">
         ${mvo.bookName }
      </div>
      <div class="cell" data-title="Price">
         ${mvo.bookPrice }
      </div>
      <div class="cell" data-title="Descrition">
         ${mvo.bookDescription }
      </div>
      <div class="cell" data-title="Imgpath">
        ${mvo.bookImgPath }
      </div>
    </div>
    </c:forEach>
  	</div>
  </div>
  
  

 </section>
 <%@ include file="../includes/footer.jsp" %>
</body>
</html>