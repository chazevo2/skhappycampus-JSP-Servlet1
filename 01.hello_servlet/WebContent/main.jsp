<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<header>
		<a href="#">로그아웃</a>
		<a href="#">마이페이지</a>
		|| 아이디 : <%= session.getAttribute("memberId") %> || 등급 : <%= session.getAttribute("grade") %>
	</header>
	<hr>
	<h3>회원 서비스 메인 페이지</h3>
	<div>
	
	</div>
</body>
</html>