<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>FindIdResult page</title>
</head>
<body>
<div class="findid-wrapper">
<section class="findid-form">
  <form action="findidresult.do" name="frm" method="get">
 <c:if test="${mem_id != null}">    
      <div class = "container">
      	<div class = "found-success">
	      <h4>  회원님의 아이디는 </h4>  
	      <div class ="found-id">${mem_id}</div>
	      <h4>  입니다 </h4>
	     </div>
	     <div class = "found-login">
 		    <input type="button" id="btnLogin" value="로그인" onclick ="location.href='login.do'"/>
       	</div>
       </div>
       </c:if>
		<c:if test="${mem_id == null}">
        <div class = "container">
      	<div class = "found-fail">
	      <h4> 등록된 정보가 없습니다 </h4>  
	     </div>
	     <div class = "found-login">
 		    <input type="button" id="btnback" value="다시 찾기" onclick="history.back()"/>
 		    <input type="button" id="btnjoin" value="회원가입" onclick="location.href='signup.do'"/>
       	</div>
       </div>
       </c:if>
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