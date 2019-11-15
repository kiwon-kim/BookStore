<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%@include file="css.jsp" %>
</head>
<body>
	<%@include file="header.jsp" %>
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <!-- Add your site or application content here -->
        <!-- Breadcrumbs Area Start -->
        <div class="breadcrumbs-area">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
					    <div class="breadcrumbs">
					       <h2>SHOP LEFT SIDEBAR</h2> 
					       <ul class="breadcrumbs-list">
						        <li>
						            <a title="Return to Home" href="index.html">Home</a>
						        </li>
						        <li>SHOP LEFT SIDEBAR</li>
						    </ul>
					    </div>
					</div>
				</div>
			</div>
		</div> 
		<!-- Breadcrumbs Area Start --> 
        <!-- Shop Area Start -->
        <div class="shopping-area section-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-9 col-sm-9 col-xs-12">
                        <div class="shop-tab-area">
                            <div class="shop-tab-list">
                                <div class="shop-tab-pill pull-left">
                                    <ul>
                                        <li class="active" id="left"><a data-toggle="pill" href="#home"><i class="fa fa-th"></i><span>Grid</span></a></li>
                                        <li><a data-toggle="pill" href="#menu1"><i class="fa fa-th-list"></i><span>List</span></a></li>
                                    </ul>
                                </div>
                                <div class="shop-tab-pill pull-right">
                                    <ul>
                                        <li class="product-size-deatils">
                                            <div class="show-label">
                                                <label>Show : </label>
                                                <select>
                                                    <option value="10" selected="selected">10</option>
                                                    <option value="09">09</option>
                                                    <option value="08">08</option>
                                                    <option value="07">07</option>
                                                    <option value="06">06</option>
                                                </select>
                                            </div>
                                        </li>
                                        <li class="product-size-deatils">
                                            <div class="show-label">
                                                <label><i class="fa fa-sort-amount-asc"></i>Sort by : </label>
                                                <select>
                                                    <option value="position" selected="selected">Position</option>
                                                    <option value="Name">Name</option>
                                                    <option value="Price">Price</option>
                                                </select>
                                            </div>
                                        </li>	
                                        <li class="shop-pagination"><a href="#">1</a></li>
                                        <li class="shop-pagination"><a href="#">2</a></li>
                                        <li class="shop-pagination"><a href="#"><i class="fa fa-caret-right"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="tab-content">
                                <div class="row tab-pane fade in active" id="home">
                                    <div class="shop-single-product-area">
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/1.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">East of eden</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/2.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">People of the book</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/3.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">The secret letter</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/4.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">Lone some dove</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/5.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">The historian</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/6.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">East of eden</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/7.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">Cold mountain</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 col-sm-6">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/8.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">Twilight</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                        <div class="col-md-4 hidden-sm">
											<div class="single-banner">
												<div class="product-wrapper">
													<a href="#" class="single-banner-image-wrapper">
														<img alt="" src="img/featured/1.jpg">
														<div class="price"><span>$</span>160</div>
													</a>
													<div class="product-description">
														<div class="functional-buttons">
															<a href="#" title="Add to Cart">
																<i class="fa fa-shopping-cart"></i>
															</a>
															<a href="#" title="Add to Wishlist">
																<i class="fa fa-heart-o"></i>
															</a>
															<a href="#" title="Quick view" data-toggle="modal" data-target="#productModal">
																<i class="fa fa-compress"></i>
															</a>
														</div>
													</div>
												</div>
												<div class="banner-bottom text-center">
													<div class="banner-bottom-title">
														<a href="#">East of eden</a>
													</div>
													<div class="rating-icon">
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star icolor"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
													</div>
												</div>
											</div>
                                        </div>
                                    </div>
                                </div>
                                <div id="menu1" class="tab-pane fade">
                                    <div class="row">
                                        <div class="single-shop-product">
                                            <div class="col-xs-12 col-sm-5 col-md-4">
                                                <div class="left-item">
                                                    <a href="single-product.html" title="East of eden">
                                                        <img src="img/featured/1.jpg" alt="">
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-sm-7 col-md-8">
                                                <div class="deal-product-content">
                                                    <h4>
                                                        <a href="single-product.html" title="East of eden">East of eden</a>
                                                    </h4>
                                                    <div class="product-price">
                                                        <span class="new-price">$ 140.00</span>
                                                        <span class="old-price">$ 120.00</span>
                                                    </div>
                                                    <div class="list-rating-icon">
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </div>
                                                    <p>Faded short sleeves t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!</p>
                                                    <div class="availability">
                                                        <span>In stock</span>
                                                        <span><a href="cart.html">Add to cart</a></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="single-shop-product">
                                            <div class="col-xs-12 col-sm-5 col-md-4">
                                                <div class="left-item">
                                                    <a href="single-product.html" title="People of the book">
                                                        <img src="img/featured/2.jpg" alt="">
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-sm-7 col-md-8">
                                                <div class="deal-product-content">
                                                    <h4>
                                                        <a href="single-product.html" title="People of the book">People of the book</a>
                                                    </h4>
                                                    <div class="product-price">
                                                        <span class="new-price">$ 140.00</span>
                                                        <span class="old-price">$ 120.00</span>
                                                    </div>
                                                    <div class="list-rating-icon">
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </div>
                                                    <p>Faded short sleeves t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!</p>
                                                    <div class="availability">
                                                        <span>In stock</span>
                                                        <span><a href="cart.html">Add to cart</a></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="single-shop-product">
                                            <div class="col-xs-12 col-sm-5 col-md-4">
                                                <div class="left-item">
                                                    <a href="single-product.html" title="The secret letter">
                                                        <img src="img/featured/3.jpg" alt="">
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-sm-7 col-md-8">
                                                <div class="deal-product-content">
                                                    <h4>
                                                        <a href="single-product.html" title="The secret letter">The secret letter</a>
                                                    </h4>
                                                    <div class="product-price">
                                                        <span class="new-price">$ 140.00</span>
                                                        <span class="old-price">$ 120.00</span>
                                                    </div>
                                                    <div class="list-rating-icon">
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </div>
                                                    <p>Faded short sleeves t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!</p>
                                                    <div class="availability">
                                                        <span>In stock</span>
                                                        <span><a href="cart.html">Add to cart</a></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="single-shop-product">
                                            <div class="col-xs-12 col-sm-5 col-md-4">
                                                <div class="left-item">
                                                    <a href="single-product.html" title="Lone some dove">
                                                        <img src="img/featured/4.jpg" alt="">
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="col-xs-12 col-sm-7 col-md-8">
                                                <div class="deal-product-content">
                                                    <h4>
                                                        <a href="single-product.html" title="Lone some dove">Lone some dove</a>
                                                    </h4>
                                                    <div class="product-price">
                                                        <span class="new-price">$ 140.00</span>
                                                        <span class="old-price">$ 120.00</span>
                                                    </div>
                                                    <div class="list-rating-icon">
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star icolor"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </div>
                                                    <p>Faded short sleeves t-shirt with high neckline. Soft and stretchy material for a comfortable fit. Accessorize with a straw hat and you're ready for summer!</p>
                                                    <div class="availability">
                                                        <span>In stock</span>
                                                        <span><a href="cart.html">Add to cart</a></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Shop Area End -->
		<!-- Footer Area Start -->
		<%@ include file= "footer.jsp" %>
		
		<!-- Footer Area End -->        
		<!--Quickview Product Start -->
        <div id="quickview-wrapper">
            <!-- Modal -->
            <div class="modal fade" id="productModal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        </div>
                        <div class="modal-body">
                            <div class="modal-product">
                                <div class="product-images">
                                    <div class="main-image images">
                                        <img alt="" src="img/quick-view.jpg">
                                    </div>
                                </div>
                                <div class="product-info">
                                    <h1>Frame Princes Cut Diamond</h1>
                                    <div class="price-box">
                                        <p class="s-price"><span class="special-price"><span class="amount">$280.00</span></span></p>
                                    </div>
                                    <a href="product-details.html" class="see-all">See all features</a>
                                    <div class="quick-add-to-cart">
                                        <form method="post" class="cart">
                                            <div class="numbers-row">
                                                <input type="number" id="french-hens" value="3">
                                            </div>
                                            <button class="single_add_to_cart_button" type="submit">Add to cart</button>
                                        </form>
                                    </div>
                                    <div class="quick-desc">
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla.
                                    </div>
                                    <div class="social-sharing">
                                        <div class="widget widget_socialsharing_widget">
                                            <h3 class="widget-title-modal">Share this product</h3>
                                            <ul class="social-icons">
                                                <li><a target="_blank" title="Facebook" href="#" class="facebook social-icon"><i class="fa fa-facebook"></i></a></li>
                                                <li><a target="_blank" title="Twitter" href="#" class="twitter social-icon"><i class="fa fa-twitter"></i></a></li>
                                                <li><a target="_blank" title="Pinterest" href="#" class="pinterest social-icon"><i class="fa fa-pinterest"></i></a></li>
                                                <li><a target="_blank" title="Google +" href="#" class="gplus social-icon"><i class="fa fa-google-plus"></i></a></li>
                                                <li><a target="_blank" title="LinkedIn" href="#" class="linkedin social-icon"><i class="fa fa-linkedin"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div><!-- .product-info -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--End of Quickview Product-->	
		<!-- all js here -->
		<!-- jquery latest version -->
        <script src="js/vendor/jquery-1.12.0.min.js"></script>
		<!-- bootstrap js -->
        <script src="js/bootstrap.min.js"></script>
		<!-- owl.carousel js -->
        <script src="js/owl.carousel.min.js"></script>
		<!-- jquery-ui js -->
        <script src="js/jquery-ui.min.js"></script>
		<!-- jquery Counterup js -->
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/waypoints.min.js"></script>	
		<!-- jquery countdown js -->
        <script src="js/jquery.countdown.min.js"></script>
		<!-- jquery countdown js -->
        <script type="text/javascript" src="venobox/venobox.min.js"></script>
		<!-- jquery Meanmenu js -->
        <script src="js/jquery.meanmenu.js"></script>
		<!-- wow js -->
        <script src="js/wow.min.js"></script>	
		<script>
			new WOW().init();
		</script>
		<!-- scrollUp JS -->		
        <script src="js/jquery.scrollUp.min.js"></script>
		<!-- plugins js -->
        <script src="js/plugins.js"></script>
		<!-- Nivo slider js -->
		<script src="lib/js/jquery.nivo.slider.js" type="text/javascript"></script>
		<script src="lib/home.js" type="text/javascript"></script>
		<!-- main js -->
        <script src="js/main.js"></script>
    </body>
</html>