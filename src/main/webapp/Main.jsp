<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
<link rel="stylesheet" href="css/Main.css">
<!-- 부트스트랩은 반응형 웹 -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>쇼핑몰</title>
<!-- 부트스트랩 CSS추가하기 -->
<meta name="viewport" content="width=device-width,initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="./css/bootstrap.min.css">

</head>
<body>

<div class="wrapper">
	
	<div class="wrap">
		<div class="top_area">
			<div class="logo_area">
		 <img src="images/logo.jpg" >
			</div>
			
			<div class="search">
			<div class="search-box">
		  <input type="text" placeholder="검색어 입력">
  		<a class="search-btn" href="#">
  		</a>
  		</div>
  			</div>
			
			<div class="login_area">
				<ul>
				<li><a href="#">로그인</a></li>
				<li><a href="#">마이페이지</a></li>
				<li><a href="#">공지페이지</a></li>
				</ul>
			</div>
			</div>
		
		<!-- 네비바 -->
      <nav class="navi_bar_area">
        <ul class="clearfix">
          <li><a class="menuLink" href="#">Best</a></li> <!--""<-여기 부분에 URL 작성하면 됨-->
          <li><a class="menuLink" href="#">Bag</a></li>
          <li><a class="menuLink" href="#">Shose</a></li>
          <li><a class="menuLink" href="#">jewelry</a></li>
          <li><a class="menuLink" href="#">.etc</a></li>
      </ul>
    </nav>
		<!-- 본문시작 -->
	<div class="sum_img">
 	<img class="main_img" src="images/main.jpg">
  </div>
    <h1>Our new Products</h1> 
    
		<div class="content_area">

			<div class="products">
      <a href="#">
        <img src="images/1.jpg">
        <p>Sunglasses</p>
        <p class="price">49,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Tassel Loafer</p>
        <p class="price">89,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Begie Bag</p>
        <p class="price">69,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Sneakers</p>
        <p class="price">79,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Slippers</p>
        <p class="price">29,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Wrist Watch</p>
        <p class="price">99,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Fedora Hat</p>
        <p class="price">39,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Classic Loafer</p>
        <p class="price">99,000</p>
      </a>
      <a href="#">
        <img src="images/2.jpg">
        <p>Pink Bag</p>
        <p class="price">79,000</p>
      </a>
        <a href="#">
        <img src="images/2.jpg">
        <p>Pink Bag</p>
        <p class="price">79,000</p>
      </a>
		</div>
	</div>
</div>

	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="./js/jquery.min.js">
		
	</script>
	<!-- 파퍼 자바스크립트 추가하기 -->
	<script src="./js/popper.js">
		
	</script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="./js/bootstrap.min.js">
		
	</script>
</body>
</html>