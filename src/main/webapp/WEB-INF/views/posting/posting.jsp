<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../common/common-import-resources.jsp"/>
<script type="text/javascript" src="/blog/resources/lib/materialize/dist/js/init.js"></script>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/home-style.css" media="screen,projection"/>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/posting-style.css" media="screen,projection"/>
<title>엔카 블로그</title>
</head>
<body>
	<!-- nav header -->
	<c:import url="../common/common-import-header.jsp"/>
	
	<div class="container">
		<div class="section">
			<div class="row center posting-hedaer">
				<div class="col s10">
					<div class="col s2">
						<c:import url="../common/common-import-posting-sidenav.jsp"/>
					</div>
					<div class="col s8 posting-title-header">
						<h3 class="row align-left left-align">첫번째 주제</h3>					
					</div>
				</div>
				<div class="row"></div>
				<hr class="col s12 title-division"/>
			</div>
			
			<!--   Icon Section   -->
			<div class="row posting-section">
				<div class="card col s3 offset-s1">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/blog/resources/img/post1.png">
					</div>
					<div class="card-content">
						<span class="card-title activator grey-text text-darken-4">포스팅 제목
							<i class="material-icons right tooltipped" data-position="top" data-delay="50" data-tooltip="포스팅 상세">more_vert</i>
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
						<span class="card-title activator grey-text text-darken-4">포스팅 제목
							<i class="material-icons right tooltipped" data-position="top" data-delay="50" data-tooltip="포스팅 상세">more_vert</i>
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
						<span class="card-title activator grey-text text-darken-4">포스팅 제목
							<i class="material-icons right tooltipped" data-position="top" data-delay="50" data-tooltip="포스팅 상세">more_vert</i>
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
			
			<!--  -->
			
			<div class="row posting-section">
				<div class="card col s3 offset-s1">
					<div class="card-image waves-effect waves-block waves-light">
						<img class="activator" src="/blog/resources/img/post1.png">
					</div>
					<div class="card-content">
						<span class="card-title activator grey-text text-darken-4">포스팅 제목
							<i class="material-icons right tooltipped" data-position="top" data-delay="50" data-tooltip="포스팅 상세">more_vert</i>
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
						<span class="card-title activator grey-text text-darken-4">포스팅 제목
							<i class="material-icons right tooltipped" data-position="top" data-delay="50" data-tooltip="포스팅 상세">more_vert</i>
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
						<span class="card-title activator grey-text text-darken-4">포스팅 제목
							<i class="material-icons right tooltipped" data-position="top" data-delay="50" data-tooltip="포스팅 상세">more_vert</i>
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

		<div class="fixed-action-btn horizontal click-to-toggle">
			<a class="btn-floating btn-large red">
				<i class="material-icons">menu</i>
			</a>
			<ul>
				<li>
					<a class="btn-floating btn-medium red tooltipped dropdown-button" data-activates='post-subject-list' data-position="top" data-delay="50" data-tooltip="글쓰기">
						<i class="material-icons">note_add</i>
					</a>
				</li>
				<li>
					<a class="btn-floating btn-medium yellow darken-1 tooltipped" data-position="top" data-delay="50" data-tooltip="설정">
						<i class="material-icons">settings</i>
					</a>
				</li>
			</ul>
		</div>

		<ul id='post-subject-list' class='dropdown-content'>
			<li><a href="/blog/posting/add-posting">첫번째 주제</a></li>
			<li><a href="#!">두번째 주제</a></li>
			<li><a href="#!">세번째 주제</a></li>
			<li><a href="#!">네번째 주제</a></li>
			<li><a href="#!">다섯번째 주제</a></li>
		</ul>
	</div>
	
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
	
	<script type="text/javascript">
		$('.dropdown-button').dropdown({
			inDuration : 300,
			outDuration : 225,
			constrain_width : false, // Does not change width of dropdown to that of the activator
			hover : false, // Activate on hover
			gutter : 0, // Spacing from edge
			belowOrigin : false, // Displays dropdown below the button
			alignment : 'left' // Displays dropdown with edge aligned to the left of button
		});
	</script>
</body>
</html>