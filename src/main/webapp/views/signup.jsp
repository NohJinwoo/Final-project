<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- header 불러오기 -->
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="script/member.js"></script>
<link rel="stylesheet" href="../css/signup.css">
<link rel="stylesheet" href="css/Main.css">

<title>쇼핑몰</title>

<title>Signup page</title>
</head>

<body>
	<div class="signup-wrapper">
	<section class="signup-form">
		<h2>회원가입</h2>
		<form action="signup.do" method="post" name="frm">
		<div class="textForm">
			<input name="mem_id" type="text" class="id" placeholder="아이디">
			<input type="hidden" name="reid" size="20"> 
			<input type="button" value="중복 체크" onclick="idCheck()">
		</div>
		<div class="textForm">
			<input name="mem_pw" type="password" class="pw" placeholder="비밀번호">
		</div>
		<div class="textForm">
			<input name="mem_pwcheck" type="password" class="pw" placeholder="비밀번호 확인">
		</div>
		<div class="textForm">
			<input name="mem_name" type="text" class="name" placeholder="이름">
		</div>
		<div class="textForm">
			<input name="mem_nickname" type="text" class="nickname" placeholder="닉네임">
		</div>
		<div class="textForm">
			<input name="mem_email" type="text" class="email" placeholder="이메일">
		</div>
		<div class="textForm">
			<input name="mem_addr" type="text" class="addr" placeholder="주소">
		</div>
		<div class="textForm">
			<input name="mem_detailaddr" type="text" class="detailaddr" placeholder="상세주소">
		</div>
		<div class="textForm">
			<input name="mem_phone" type="text" class="cellphoneNo" placeholder="전화번호">
		</div>
		<input type="submit" class="btn" value="J O I N" onclick="return joinCheck()">
		<input type="button" class="btn" value="C A N C E L" onclick="location.href='login.do'">
		</form>
		</section>
	</div>
	
	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="../js/jquery.min.js"></script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="../js/popper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="../js/bootstrap.min.js"></script>
	
</body>
</html>