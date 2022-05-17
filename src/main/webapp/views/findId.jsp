<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <!-- header 불러오기 -->
<%@include file ="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="script/member.js"></script>
<link rel="stylesheet" href="css/Main.css">
<link rel="stylesheet" href="css/findid.css">
<meta charset="UTF-8">

<title>쇼핑몰</title>

<title>FindId page</title>
</head>
<body>
<div class="findid-wrapper">
<section class="findid-form">
			<h3>휴대폰 본인확인</h3>
			<form action="findid.do" name="frm" method ="get">
			
		<section class = "form-search">
			<div class = "find-name">
				<label>이름</label>
				<input type="text" name="mem_name" class = "btn-name" placeholder = "등록한 이름">
			<br>
			</div>
			<div class = "find-phone">
				<label>번호</label>
				<input type="text" onKeyup = "addHypen(this);" name="mem_phone" class = "btn-phone" placeholder = "휴대폰번호를 '-'없이 입력">
			</div>
			<br>
	</section>
	<div class ="btnSearch">
		<input type="button" name="enter" value="찾기"  onclick="idSearch()">
		<input type="button" name="cancel" value="취소" onclick="history.back()">
 	</div>
 	<div class="alter-area">
 	${message}
 	</div>
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