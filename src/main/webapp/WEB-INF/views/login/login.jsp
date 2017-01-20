<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link type="text/css" rel="stylesheet"
	href="/blog/resources/lib/materialize/dist/css/materialize.min.css"
	media="screen,projection" />
<link type="text/css" rel="stylesheet"
	href="/blog/resources/lib/materialize/dist/css/style.css"
	media="screen,projection" />
<script type="text/javascript"
	src="/blog/resources/lib/jquery/dist/jquery.min.js"></script>
<script type="text/javascript"
	src="/blog/resources/lib/materialize/dist/js/materialize.min.js"></script>
<meta name="viewport" charset="UTF-8"
	content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no" />
<title>엔카 블로그</title>
<style>
body {
	display: flex;
	min-height: 100vh;
	flex-direction: column;
}

main {
	flex: 1 0 auto;
}

body {
	background: #fff;
}

.input-field input[type=date]:focus+label, .input-field input[type=text]:focus+label,
	.input-field input[type=email]:focus+label, .input-field input[type=password]:focus+label
	{
	color: #e91e63;
}

.input-field input[type=date]:focus, .input-field input[type=text]:focus,
	.input-field input[type=email]:focus, .input-field input[type=password]:focus
	{
	border-bottom: 2px solid #e91e63;
	box-shadow: none;
}
</style>
</head>
<body>
	<div class="section"></div>
	<main>
	<center>
		<div class="section"></div>
		<div class="section"></div>
		<div class="section"></div>
		<div class="section"></div>

		<div class="container">
			<div class="z-depth-4 grey lighten-4 row"
				style="display: inline-block; padding: 32px 48px 0px 48px; border: 1px solid #EEE;">
				<h3 class="red-text text-darken1">엔카 블로그</h3>
				<form class="col s12" method="post">
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
							<button type='submit' name='btn_login' class='col s12 btn btn-large waves-effect red darken-1'>로그인</button>
						</div>
						<div class='row'>
							<button type='submit' name='btn_join' class='col s12 btn btn-large waves-effect red darken-1'>회원가입</button>
						</div>
						<div class='row'>
							<a id="btn_home" href="/blog" name='btn_home' class='col s12 btn btn-large waves-effect red darken-1'>홈으로</a>
						</div>
					</center>
				</form>
			</div>
		</div>
	</center>

	<div class="section"></div>
	<div class="section"></div>
	</main>
</body>
</html>