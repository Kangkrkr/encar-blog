<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<c:import url="../common/common-import-resources.jsp"/>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/login-style.css" media="screen,projection"/>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/home-style.css" media="screen,projection"/>
<title>엔카 블로그</title>
</head>
<body>
	<!-- nav header -->
	<c:import url="../common/common-import-header.jsp"/>
	
	<div class="section"></div>
	<main>
	<center>
		<div class="section"></div>
		<div class="section"></div>
		<div class="section"></div>

		<div class="row login-container">
			<div class="col s6 offset-s3">
				<div class="z-depth-5 grey lighten-4 row" style="display: inline-block; padding: 32px 80px 30px 80px; border: 1px solid #EEE;">
					<h3 class="red-text text-darken1">엔카 블로그</h3>
					<form class="col s12" action="/blog/login-process" method="post">
						<div class='row'>
							<div class='col s12'></div>
						</div>
	
						<div class='row'>
							<div class='input-field col s12'>
								<input class='validate' type="text" name='account' id='account' />
								<label for='account'>계정을 입력하세요</label>
							</div>
						</div>
	
						<div class='row'>
							<div class='input-field col s12'>
								<input class='validate' type='password' name='password' id='password' /> <label for='password'>비밀번호를 입력하세요</label>
							</div>
							<label style='float: right;'> <a class='pink-text' href='/blog/find-password'><b>암호가 기억나지 않나요?</b></a>
							</label>
						</div>
	
						<br />
						<center>
							<div class='row'>
								<button type='submit' name='btn_login' class='col s12 btn btn-large waves-effect red darken-1 z-depth-3'>로그인</button>
							</div>
							<div class='row'>
								<a id="btn_join" href="/blog/join" name='btn_join' class='col s12 btn btn-large waves-effect red darken-1 z-depth-3'>회원가입</a>
							</div>
							<div class='row'>
								<a id="btn_home" href="/blog" name='btn_home' class='col s12 btn btn-large waves-effect red darken-1 z-depth-3'>홈으로</a>
							</div>
						</center>
					</form>
				</div>
			</div>
		</div>
	</center>

	<div class="section"></div>
	<div class="section"></div>
	</main>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('.login-container').fadeTo(800, 1.0);
		});
	</script>
</body>
</html>