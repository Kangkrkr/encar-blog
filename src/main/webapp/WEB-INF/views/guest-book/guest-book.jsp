<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="../common/common-import-resources.jsp"/>
<script type="text/javascript" src="/blog/resources/lib/materialize/dist/js/init.js"></script>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/guest-book-style.css" media="screen,projection"/>
<title>엔카 블로그</title>
</head>
<body>
	<!-- nav header -->
	<c:import url="../common/common-import-header.jsp"/>

	<div id="index-banner" class="parallax-container">
		<div class="section no-pad-bot">
			<div class="container">
				<br>
				<br>
				<h1 class="header center grey-text text-lighten-2">방명록을 남겨보세요.</h1>
				<div class="row center">
					<h5 class="header col s12 light">엔카 블로그는 어떘나요?</h5>
				</div>
				<div class="row center">
					<a class="col s2 offset-s5 waves-effect waves-light red lighten-1 btn login-btn"><i class="material-icons left">perm_identity</i>방명록 남기기</a>
				</div>
			</div>
		</div>
		<div class="parallax">
			<img src="/blog/resources/img/background1.jpg" alt="Unsplashed background img 1">
		</div>
	</div>

	<div class="row container">
		<ul class="collection col s8 offset-s2">
			<li class="collection-item row">
				<div class="col s2 img-container">
					<img src="/blog/resources/img/me.jpg" alt=""/>
				</div>	
				<div class="col s10">
					<h5 class="title">안녕하세요</h5>
					<hr/>
					<p class="content">좋은블로그네요 잘보고 갑니다~~ 더 좋은 포스틍으로 부탁드려요 감사합니다.</p>
				</div>
			</li>
		</ul>
	</div>

	<!-- footer -->
	<c:import url="../common/common-import-footer.jsp"/>
</body>
</html>