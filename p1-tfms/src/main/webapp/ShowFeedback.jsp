<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.revature.config.ConnectionFactory" %>
    <%@ page import="java.sql.*" %>
    
<!-- <!DOCTYPE html> -->
<html>
<HEAD>
       <TITLE>The View Of Database Table </TITLE>
       <!-- Favicons -->
<link href="assets/img/favicon.png" rel="icon" />
<link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet" />

<!-- Vendor CSS Files -->
<link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet" />
<link href="assets/vendor/aos/aos.css" rel="stylesheet" />
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet" />
<link href="assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet" />
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet" />
<link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet" />

<!-- Template Main CSS File -->
<link href="assets/css/style.css" rel="stylesheet" />
       </HEAD>
       <BODY >
       
	<!-- ======= Header ======= -->
	<header id="header" style="margin-bottom:10px">
		<div class="container d-flex align-items-center">

			<h1 class="logo me-auto">
				<a href="index.html">CodeTech</a>
			</h1>
			<!-- Uncomment below if you prefer to use an image logo -->
			<!-- <a href="index.html" class="logo me-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

			<nav id="navbar" class="navbar order-last order-lg-0">
				<ul>
					<li><a class="active" href="index.html">Home</a></li>
					<li><a href="about.html">About</a></li>
					<li><a href="courses.html">Courses</a></li>
					
				</ul>
				<i class="bi bi-list mobile-nav-toggle"></i>
			</nav>
			<a href="index.jsp" class="get-started-btn">Logout</a>
			<!-- .navbar -->


		</div>
	</header>
		<div class="breadcrumbs" data-oas="fade-in" style="margin-top:5px">
			<div class="container">
				<h3> Overall Rating of All Trainers</h3>
				<br>
			</div>
		</div>
	<!-- <div style="text-align:center">
       <h4>The View Of Database Table</h4></div> -->
       <%
       
           Connection connection = ConnectionFactory.getConnection();
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("select v1.TrainerName,v1.Topic,v1.Section,v1.AverageRatingbySection,v2.Rating from bySection v1 join byTrainer  v2 on v1.TrainerName=v2.TrainerName;") ;
       %>
      <TABLE class="table table-responsive table-borderLess" style="text-align:center">
      <TR>
      <th scope='col' width="20%">Trainer_Name</th>
      <th scope='col' width="20%">Topic</th>
      <th scope='col' width="20%">Section</th>
      <th scope='col' width="20%">Topic Wise Rating</th>
      <th scope='col' width="20%">Overall Rating</th>
      
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
       
      </TR>
      <% } %>
     </TABLE>
     </BODY>
     	
     	
     	
     	
     	
     	<!-- ======= Footer ======= -->
	<footer id="footer">
		<div class="footer-top">
			<div class="container">
				<div class="row">
					<div class="col-lg-3 col-md-6 footer-contact">
						<h3>Mentor</h3>
						<p>
							A108 Adam Street <br /> New York, NY 535022<br /> United States
							<br /> <br /> <strong>Phone:</strong> +1 5589 55488 55<br /> <strong>Email:</strong>
							info@example.com<br />
						</p>
					</div>

					<div class="col-lg-2 col-md-6 footer-links">
						<h4>Useful Links</h4>
						<ul>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Home</a>
							</li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">About
									us</a></li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Services</a>
							</li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Terms
									of service</a></li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Privacy
									policy</a></li>
						</ul>
					</div>

					<div class="col-lg-3 col-md-6 footer-links">
						<h4>Our Services</h4>
						<ul>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Web
									Design</a></li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Web
									Development</a></li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Product
									Management</a></li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a>
							</li>
							<li><i class="bx bx-chevron-right"></i> <a href="#">Graphic
									Design</a></li>
						</ul>
					</div>

					<div class="col-lg-4 col-md-6 footer-newsletter">
						<h4>Join Our Newsletter</h4>
						<p>Tamen quem nulla quae legam multos aute sint culpa legam
							noster magna</p>
						<form action="" method="post">
							<input type="email" name="email" /><input type="submit"
								value="Subscribe" />
						</form>
					</div>
				</div>
			</div>
		</div>

		<div class="container d-md-flex py-4">
			<div class="me-md-auto text-center text-md-start">
				<div class="copyright">
					&copy; Copyright <strong><span>Mentor</span></strong>. All Rights
					Reserved
				</div>
				<div class="credits">
					<!-- All the links in the footer should remain intact. -->
					<!-- You can delete the links only if you purchased the pro version. -->
					<!-- Licensing information: https://bootstrapmade.com/license/ -->
					<!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/mentor-free-education-bootstrap-theme/ -->
					Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
				</div>
			</div>
			<div class="social-links text-center text-md-right pt-3 pt-md-0">
				<a href="#" class="twitter"><i class="bx bxl-twitter"></i></a> <a
					href="#" class="facebook"><i class="bx bxl-facebook"></i></a> <a
					href="#" class="instagram"><i class="bx bxl-instagram"></i></a> <a
					href="#" class="google-plus"><i class="bx bxl-skype"></i></a> <a
					href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
			</div>
		</div>
	</footer>
	<!-- End Footer -->
</html>