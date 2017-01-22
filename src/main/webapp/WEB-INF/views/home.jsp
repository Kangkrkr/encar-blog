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

	<!-- footer -->
	<c:import url="common/common-import-footer.jsp"/>
	
</body>
</html>