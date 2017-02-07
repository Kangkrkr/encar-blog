<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="/blog/resources/css/posting-sidenav-style.css" media="screen,projection"/>
<meta charset="UTF-8">
</head>
<body>
	<ul id="slide-out" class="posting side-nav">
		<hr class="divider"/>
		<c:forEach items="${reqVO.subjects}" var="subject">
			<li><a>${subject.SUBJECT_NAME}</a></li>
		</c:forEach>
		<hr class="divider"/>
		<sec:authorize access="hasAnyRole('ADMIN', 'SUPER_USER')">
			<li><a class="subheader">포스팅 방법</a></li>
			<li><a class="waves-effect" href="#!">포스팅은 어떻게 하나요?</a></li>
		</sec:authorize>
	</ul>
	<a href="#" data-activates="slide-out" class="button-collapse tooltipped" data-position="top" data-delay="50" data-tooltip="카테고리">
		<i class="medium material-icons">menu</i>
	</a>
	<script type="text/javascript">
		$(document).ready(function(){
			$(".button-collapse").sideNav({
				closeOnClick : true
			});
		});
	</script>
</body>
</html>