<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="common/common-import-resources.jsp"/>
<script type="text/javascript" src="/blog/resources/lib/materialize/dist/js/init.js"></script>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/home-style.css" media="screen,projection"/>
<title>엔카 블로그</title>
</head>
<body>
	<!-- nav header -->
	<c:import url="common/common-import-header.jsp"/>

	<div id="index-banner" class="parallax-container">
		<div class="section no-pad-bot">
			<div class="container">
				<br>
				<br>
				<h1 class="header center grey-text text-lighten-2">엔카 블로그에 오신것을 환영합니다.</h1>
				<div class="row center">
					<h5 class="header col s12 light">엔카 블로그에서 다양한 차량을 만나보세요!</h5>
				</div>
				<div class="row center">
					<a href="/blog/login" class="col s4 offset-s4 waves-effect waves-light red lighten-1 btn login-btn"><i class="material-icons left">vpn_key</i>로그인</a>
				</div>
				<br>
				<br>

			</div>
		</div>
		<div class="parallax">
			<img src="/blog/resources/img/background1.jpg" alt="Unsplashed background img 1">
		</div>
	</div>

	<div class="container">
		<div class="section">
			<div class="row center recent-posting-title">
				<h3 class="header col s12 black-text text-lighten-2">최근 포스팅</h3>
			</div>
			
			<!--   Icon Section   -->
			<div class="row posting-section">
				<div class="card col s3 offset-s1">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/blog/resources/img/post1.png">
					</div>
					<div class="card-content">
						<span class="card-title activator grey-text text-darken-4">리스프로그램 ZERO!
							<i class="material-icons right">more_vert</i>
						</span>
						<p>
							<a href="#">간략한 글의 내용</a>
						</p>
					</div>
					<div class="card-reveal">
						<span class="card-title grey-text text-darken-4">포스팅 제목
							<i class="material-icons right">close</i>
						</span>
						<p>Here is some more information about this product that is
						only revealed once clicked on.</p>
					</div>
				</div>

				<div class="card col s3 offset-s1">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/blog/resources/img/post2.png">
					</div>
					<div class="card-content">
						<span class="card-title activator grey-text text-darken-4">유레카를 소개합니다.
							<i class="material-icons right">more_vert</i>
						</span>
						<p>
							<a href="#">간략한 글의 내용</a>
						</p>
					</div>
					<div class="card-reveal">
						<span class="card-title grey-text text-darken-4">포스팅 제목
							<i class="material-icons right">close</i>
						</span>
						<p>Here is some more information about this product that is
						only revealed once clicked on.</p>
					</div>
				</div>
				
				<div class="card col s3 offset-s1">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/blog/resources/img/post3.png">
					</div>
					<div class="card-content">
						<span class="card-title activator grey-text text-darken-4">SK 엔카는?
							<i class="material-icons right">more_vert</i>
						</span>
						<p>
							<a href="#">간략한 글의 내용</a>
						</p>
					</div>
					<div class="card-reveal">
						<span class="card-title grey-text text-darken-4">포스팅 제목
							<i class="material-icons right">close</i>
						</span>
						<p>Here is some more information about this product that is
						only revealed once clicked on.</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="col s10 offset-s1 divider"></div>
	
	<div class="container">
		<div class="section">
			<div class="row center notification-title">
				<h3 class="header col s12 black-text text-lighten-2">공지사항</h3>
			</div>
			
			<!--   Icon Section   -->
			<div class="row notification-section">
				<div class="col s12 m4">
					<div class="icon-block">
						<h2 class="center brown-text">
							<i class="material-icons">info</i>
						</h2>
						<h5 class="center">알려 드립니다</h5>

						<p class="light">간략한 공지사항 1</p>
					</div>
				</div>

				<div class="col s12 m4">
					<div class="icon-block">
						<h2 class="center brown-text">
							<i class="material-icons">error</i>
						</h2>
						<h5 class="center">긴급 공지입니다</h5>

						<p class="light">간략한 공지사항 2</p>
					</div>
				</div>

				<div class="col s12 m4">
					<div class="icon-block">
						<h2 class="center brown-text">
							<i class="material-icons">stars</i>
						</h2>
						<h5 class="center">중요 사항입니다</h5>

						<p class="light">간략한 공지사항 1</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 
	<div class="parallax-container valign-wrapper">
		<div class="section no-pad-bot">
			<div class="container">
				<div class="row center">
					<h5 class="header col s12 light">A modern responsive front-end framework based on Material Design</h5>
				</div>
			</div>
		</div>
		<div class="parallax">
			<img src="/blog/resources/img/background2.jpg" alt="Unsplashed background img 2">
		</div>
	</div>

	<div class="container">
		<div class="section">

			<div class="row">
				<div class="col s12 center">
					<h3>
						<i class="mdi-content-send brown-text"></i>
					</h3>
					<h4>Contact Us</h4>
					<p class="left-align light">Lorem ipsum dolor sit amet,
						consectetur adipiscing elit. Nullam scelerisque id nunc nec
						volutpat. Etiam pellentesque tristique arcu, non consequat magna
						fermentum ac. Cras ut ultricies eros. Maecenas eros justo,
						ullamcorper a sapien id, viverra ultrices eros. Morbi sem neque,
						posuere et pretium eget, bibendum sollicitudin lacus. Aliquam
						eleifend sollicitudin diam, eu mattis nisl maximus sed. Nulla
						imperdiet semper molestie. Morbi massa odio, condimentum sed ipsum
						ac, gravida ultrices erat. Nullam eget dignissim mauris, non
						tristique erat. Vestibulum ante ipsum primis in faucibus orci
						luctus et ultrices posuere cubilia Curae;
					</p>
				</div>
			</div>

		</div>
	</div>


	<div class="parallax-container valign-wrapper">
		<div class="section no-pad-bot">
			<div class="container">
				<div class="row center">
					<h5 class="header col s12 light">A modern responsive front-end framework based on Material Design</h5>
				</div>
			</div>
		</div>
		<div class="parallax">
			<img src="/blog/resources/img/background3.jpg" alt="Unsplashed background img 3">
		</div>
	</div>
	 -->

	<footer class="page-footer teal">
		<div class="container">
			<div class="row">
				<div class="col l6 s12">
					<h5 class="white-text">Encar Blog</h5>
					<p class="grey-text text-lighten-4">We are a team of college
						students working on this project like it's our full time job. Any
						amount would help support and continue development on this project
						and is greatly appreciated.
					</p>
				</div>
				<div class="col l3 s12">
					<h5 class="white-text">사이트맵</h5>
					<ul>
						<li><a class="white-text" href="#!">Link 1</a></li>
						<li><a class="white-text" href="#!">Link 2</a></li>
						<li><a class="white-text" href="#!">Link 3</a></li>
						<li><a class="white-text" href="#!">Link 4</a></li>
					</ul>
				</div>
				<div class="col l3 s12">
					<h5 class="white-text">IT 개발팀 짱짱</h5>
					<ul>
						<li><a class="white-text" href="#!">Link 1</a></li>
						<li><a class="white-text" href="#!">Link 2</a></li>
						<li><a class="white-text" href="#!">Link 3</a></li>
						<li><a class="white-text" href="#!">Link 4</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="footer-copyright">
			<div class="container">Made by 
				<a class="brown-text text-lighten-3" href="http://materializecss.com">강승윤</a>
			</div>
		</div>
	</footer>
</body>
</html>