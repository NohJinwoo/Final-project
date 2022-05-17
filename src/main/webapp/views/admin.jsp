<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- header 불러오기 -->
<%@include file ="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/Main.css">

<title>쇼핑몰</title>

<title>Login page</title>
</head>

<body>
   		<div class="login-wrapper">
   		
<section class="login-form">
<h1>Login</h1>
<form action="admin.do" method="post" name="frm">  
	<div class="int area">
			<input type="text" name="emp_id" id="id" value="${emp_id}" autocomplete="off" required>
			<label for="id">USER NAME</label>
	</div>
	<div class="int-area">
		<input type="password" name="emp_pw" id="pw" autocomplete="off" required>
			<label for="pw">PASSWORD</label>
		</div>
		<div class="btn-area">
		<input type="submit" value="로그인">&nbsp;&nbsp;
		<input type="reset" value="취소">&nbsp;&nbsp;
		</div>
		<div class="alter-area">
		${message}
		</div>
</form>
</section>

<script>
let id= $('#id');
let pw= $('#pw');
let btn=$('#btn');

$(btn).on('click', function){
	if($(id).val() =="" ){
		$(id).next('label').addClass('warning');
		setTimeout(function()) {
			$('label').removeClass('warning');
		}, 1500);
		else if($(pw).val() ==""){
			$(pw).next('label').addClass('warning');
			setTimeout(function()) {
				$('label').removeClass('warning');
			}, 1500);	
		}
		}
	});

</script>
</div>

	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="../js/jquery.min.js"></script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="../js/popper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="../js/bootstrap.min.js"></script>
		
</body>
</html>