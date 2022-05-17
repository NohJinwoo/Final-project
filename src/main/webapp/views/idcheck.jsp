<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<h2>아이디 중복확인</h2>
	<form action="idCheck.do" method="get" name="frm">
		아이디 <input type=text name="mem_id" value="${mem_id}"> 
		<input type=submit value="중복 체크"> <br>
		<c:if test="${result == 1}">
			<script type="text/javascript">
				opener.document.frm.mem_id.value = "";
			</script>
			${mem_id}는 이미 사용 중인 아이디입니다.
		</c:if>
		<c:if test="${result == 0}">
			<script type="text/javascript">
			opener.document.frm.mem_id.value = "";
			</script>
			아이디는 4글자이상이어야 합니다.
		</c:if>
		<c:if test="${result==-1}">
		${mem_id}는 사용 가능한 아이디입니다.
		<input type="button" value="사용" class="cancel" onclick="idok('${mem_id}')">
		</c:if>
	</form>
	
		<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="../js/jquery.min.js"></script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="../js/popper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="../js/bootstrap.min.js"></script>
	
</body>
</html>