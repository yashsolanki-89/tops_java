<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
	<!-- catg header banner section -->
	<section id="aa-catg-head-banner">
		<img src="img/fashion/fashion-header-bg-8.jpg" alt="fashion img">
		<div class="aa-catg-head-banner-area">
			<div class="container">
				<div class="aa-catg-head-banner-content">
					<h2>Register</h2>
					<ol class="breadcrumb">
						<li><a href="index.jsp">Home</a></li>
						<li class="active">Register</li>
					</ol>
				</div>
			</div>
		</div>
	</section>
	<!-- / catg header banner section -->
	<!-- start contact section -->
	<section id="aa-contact">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="aa-contact-area">


						<!-- Contact address -->
						<div class="aa-contact-address">
							<div class="row">
								<div class="col-md-12">
									<div class="aa-contact-address-left">
										<%
											if(request.getAttribute("msg")!=null)
											{
												out.println(request.getAttribute("msg"));
											}
										%>
										<form class="comments-form contact-form" action="UserController"
											method="post">
											<div class="row">
												
												<div class="col-md-12">
													<div class="form-group">
														<select name="usertype" class="form-control">
															<option>---Select User Type---</option>
															<option value="buyer">Buyer</option>
															<option value="seller">Seller</option>														
														</select>
													</div>
												</div>

											</div>
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" placeholder="Your First Name"
															class="form-control" name="fname">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" placeholder="Your Last Name"
															class="form-control" name="lname">
													</div>
												</div>

											</div>
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<input type="email" placeholder="Email"
															class="form-control" name="email">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" placeholder="Mobile"
															class="form-control" name="mobile">
													</div>
												</div>

											</div>
											<div class="row">
												<div class="col-md-12">
													<div class="form-group">
														<textarea class="form-control" rows="3"
															placeholder="Address" name="address"></textarea>
													</div>
												</div>
											</div>
											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<input type="password" placeholder="Password"
															class="form-control" name="password">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="password" placeholder="Confirm Password"
															class="form-control" name="cpassword">
													</div>
												</div>

											</div>
											<button class="aa-secondary-btn" name="action" value="register">Register</button>
										</form>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- Subscribe section -->
	<section id="aa-subscribe">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="aa-subscribe-area">
						<h3>Subscribe our newsletter</h3>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Ex, velit!</p>
						<form action="" class="aa-subscribe-form">
							<input type="email" name="" id="" placeholder="Enter your Email">
							<input type="submit" value="Subscribe">
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- / Subscribe section -->

	<!-- footer -->
	<footer id="aa-footer">
		<!-- footer bottom -->
		<div class="aa-footer-top">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-footer-top-area">
							<div class="row">
								<div class="col-md-3 col-sm-6">
									<div class="aa-footer-widget">
										<h3>Main Menu</h3>
										<ul class="aa-footer-nav">
											<li><a href="#">Home</a></li>
											<li><a href="#">Our Services</a></li>
											<li><a href="#">Our Products</a></li>
											<li><a href="#">About Us</a></li>
											<li><a href="#">Contact Us</a></li>
										</ul>
									</div>
								</div>
								<div class="col-md-3 col-sm-6">
									<div class="aa-footer-widget">
										<div class="aa-footer-widget">
											<h3>Knowledge Base</h3>
											<ul class="aa-footer-nav">
												<li><a href="#">Delivery</a></li>
												<li><a href="#">Returns</a></li>
												<li><a href="#">Services</a></li>
												<li><a href="#">Discount</a></li>
												<li><a href="#">Special Offer</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-6">
									<div class="aa-footer-widget">
										<div class="aa-footer-widget">
											<h3>Useful Links</h3>
											<ul class="aa-footer-nav">
												<li><a href="#">Site Map</a></li>
												<li><a href="#">Search</a></li>
												<li><a href="#">Advanced Search</a></li>
												<li><a href="#">Suppliers</a></li>
												<li><a href="#">FAQ</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-6">
									<div class="aa-footer-widget">
										<div class="aa-footer-widget">
											<h3>Contact Us</h3>
											<address>
												<p>25 Astor Pl, NY 10003, USA</p>
												<p>
													<span class="fa fa-phone"></span>+1 212-982-4589
												</p>
												<p>
													<span class="fa fa-envelope"></span>dailyshop@gmail.com
												</p>
											</address>
											<div class="aa-footer-social">
												<a href="#"><span class="fa fa-facebook"></span></a> <a
													href="#"><span class="fa fa-twitter"></span></a> <a
													href="#"><span class="fa fa-google-plus"></span></a> <a
													href="#"><span class="fa fa-youtube"></span></a>
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
		<!-- footer-bottom -->
		<div class="aa-footer-bottom">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="aa-footer-bottom-area">
							<p>
								Designed by <a href="http://www.markups.io/">MarkUps.io</a>
							</p>
							<div class="aa-footer-payment">
								<span class="fa fa-cc-mastercard"></span> <span
									class="fa fa-cc-visa"></span> <span class="fa fa-paypal"></span>
								<span class="fa fa-cc-discover"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- / footer -->
	<!-- Login Modal -->
	<div class="modal fade" id="login-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-body">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4>Login or Register</h4>
					<form class="aa-login-form" action="UserController" method="post">
            <label for="">Username or Email address<span>*</span></label>
            <input type="text" placeholder="Username or email" name="email">
            <label for="">Password<span>*</span></label>
            <input type="password" placeholder="Password" name="password">
            <button class="aa-browse-btn" type="submit" value="login" name="action">Login</button>
            <label for="rememberme" class="rememberme"><input type="checkbox" id="rememberme"> Remember me </label>
            <p class="aa-lost-password"><a href="forgot-password.jsp">Lost your password?</a></p>
            <div class="aa-register-now">
            </div>
          </form>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>


	<!-- jQuery library -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.js"></script>
	<!-- SmartMenus jQuery plugin -->
	<script type="text/javascript" src="js/jquery.smartmenus.js"></script>
	<!-- SmartMenus jQuery Bootstrap Addon -->
	<script type="text/javascript" src="js/jquery.smartmenus.bootstrap.js"></script>
	<!-- To Slider JS -->
	<script src="js/sequence.js"></script>
	<script src="js/sequence-theme.modern-slide-in.js"></script>
	<!-- Product view slider -->
	<script type="text/javascript" src="js/jquery.simpleGallery.js"></script>
	<script type="text/javascript" src="js/jquery.simpleLens.js"></script>
	<!-- slick slider -->
	<script type="text/javascript" src="js/slick.js"></script>
	<!-- Price picker slider -->
	<script type="text/javascript" src="js/nouislider.js"></script>
	<!-- Custom js -->
	<script src="js/custom.js"></script>


</body>
</html>