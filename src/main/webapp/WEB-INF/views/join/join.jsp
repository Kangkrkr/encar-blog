<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
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

		<div class="row join-container" style="display: none;">
			<div class="col s12">
				<div class="z-depth-4 grey lighten-4 row" style="display: inline-block; padding: 32px 80px 20px 80px; border: 1px solid #EEE;">
					<h3 class="red-text text-darken1">회원가입</h3>
					<form class="col s12" name="joinForm" id="joinForm" mo action="/blog/join/join-process" method="post" enctype="multipart/form-data">
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
						</div>
						
						<div class='row'>
							<div class='input-field col s12'>
								<input class='validate' type='password' name='passwordConfirm' id='passwordConfirm' /> <label for='password'>비밀번호를 확인해주세요.</label>
							</div>
						</div>
						
						<div class='row'>
							<div class='input-field col s12'>
								<input class='validate' type='email' name='email' id='email' /> <label for='email'>이메일주소를 입력하세요</label>
							</div>
						</div>

						<div class="file-field col s12 tooltipped" data-position="top" data-delay="50" data-tooltip="프로필사진을 설정해주세요.">
							<div class="btn red darken-1 z-depth-3" style="margin-left: -15px;">
								<span>File</span>
								<input type="file" id="profilePic" name="profilePic"/>
							</div>
							<div class="file-path-wrapper">
								<input class="file-path validate" type="text"/>
							</div>
						</div>

						<br />
						<center style="margin-top: 60px;">
							<div class='row'>
								<button type='submit' name='btn_join' class='col s12 btn btn-large waves-effect red darken-1 z-depth-3'>회원가입</button>
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
			$('.join-container').fadeTo(800, 1.0);
			
			$('#joinForm').submit(function(e){
				e.preventDefault();
				
				var account = $('#account').val().trim();
				var password = $('#password').val().trim();
				var passwordConfirm = $('#passwordConfirm').val().trim();
				var email = $('#email').val().trim();
				
				// 계정명 체크 기능 추가 필요.
				// 데이터 validation 체크 기능 필요.
				
				if(account === '' || password === '' || passwordConfirm ==='' || email === '') {
					alert("입력하지 않은 항목을 확인해주세요.");
					return;
				}
				
				if(password !== passwordConfirm) {
					alert("비밀번호 확인을 해주세요.");
					return;
				}
				
				if(joinForm.password.value.length > 12){
					alert("비밀번호는 12자리 이하여야 합니다.");
					return;
				}

				var form = $('#joinForm')[0];
				var formData = new FormData(form);
				
				$.ajax({
					url : '/blog/join/join-process',
					type : 'POST',
					data : formData,
					processData : false,
					contentType : false,
					success : function(result){
						alert(result);
						location.href="/blog";
					},
					error : function(result){
						if(result.status === 400)
							alert(result.responseJSON);
					}
				});
			});
		});
	</script>
</body>
</html>