<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="head.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<%@ include file="header.jsp" %>
<section>
 <!-- wrapper -->
<div class="shop_wrapper">
     <h1 class="shop_h1">Bike Stock</h1>
    <div class="clear"></div>
    <c:if test="${id eq 'admin'}">
     <div style="text-align: right;">
     	<a href="productRegist.do" >상품등록</a>
     </div>
    </c:if>
    <!-- items -->
    
    <div class="items">
<!--     private int productNum; -->
<!-- 	private String productName; -->
<!-- 	private int productPrice; -->
<!-- 	private String productDescription; -->
<!-- 	private String productImgPath; -->
        <c:forEach items="${plist }" var="pvo">
        <!-- single item -->
        <div class="item">
        	<input type="hidden" name="productNum" value="${pvo.productNum }">
            <img src="${pvo.productImgPath }" alt="item" width="200" height="180"/>
             <h2>${pvo.productName }</h2>

            <p>Price: <em>${pvo.productPrice }</em>
            </p>
            <button class="add-to-cart" type="button">Add to cart</button>
        </div>
        <!--/ single item -->
        </c:forEach>
        
    </div>
    <!--/ items -->
</div>
<!--/ wrapper -->
 </section>
 <%@ include file="footer.jsp" %>
</body>
</html>