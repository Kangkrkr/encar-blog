<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<c:import url="./../common/common-import-resources.jsp"/>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/home-style.css" media="screen,projection"/>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/add-posting-style.css" media="screen,projection"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- nav header -->
	<c:import url="./../common/common-import-header.jsp"/>
	
	<div class="col s10 offset-s1 post-container">
		<div class="row valign center-align">
		<form id="post-form" class="row" name="postForm" method="post" enctype="multipart/form-data">
			<div class="row title-container">
				<div class="input-field col m8 offset-m2">
		          <input id="title" type="text" class="center-align" placeholder="제목">
		        </div>
			</div>
			<hr class="title-liner col s10 offset-s1"/>
			<div class="row item-container">
				<!-- 사용자가 직접 엘리먼트를 추가한다. -->
			</div>
		</form>
		</div>
		<div class="row post-menu-container">
			<div class="modal-footer col s8 offset-s2">
				<a class="col s3 center-align modal-action waves-effect waves-green btn-flat add-hr">구분선추가</a>
				<a class="col s3 center-align modal-action waves-effect waves-green btn-flat add-image">이미지추가</a>
				<a class="col s3 center-align modal-action waves-effect waves-green btn-flat add-content">글추가</a>
				<a class="col s3 center-align modal-action modal-close waves-effect waves-green btn-flat complete" onclick="uploadFile()">완료</a>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="/blog/resources/js/post.js"></script>
</body>
</html>