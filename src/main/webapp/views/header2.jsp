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
<!-- 부트스트랩 CSS추가하기 -->
<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>

<div class="wrapper">
	
	<div class="wrap">
		<div class="top_area" >
			<div class="logo_area">
			<a href="index.jsp">
				</a>
		 <img src="images/Logo.png" >
			</div>
			
			<div class="search">
			<div class="search-box">
		  <input type="text" placeholder="검색어 입력">
  		<a class="search-btn" href="#">
  		</a>
  		</div>
  			</div>
			
			<div class="login_area">
        		<li><a href="logout.do">로그아웃</a></li>
				<li><a href="#">마이페이지</a></li>
				<li><a href="NotionServlet?command=notion_list">공지페이지</a></li>
				</ul>			
			</div>
			</div>
		
		<!-- 네비바 -->
      <nav class="navi_bar_area">
        <ul class="clearfix">
          <li><a class="menuLink" href="#"></a></li> <!--""<-여기 부분에 URL 작성하면 됨-->
          <li><a class="menuLink" href="#">Best</a></li> <!--""<-여기 부분에 URL 작성하면 됨-->
          <li><a class="menuLink" href="#">Bag</a></li>
          <li><a class="menuLink" href="#">Shoes</a></li>
          <li><a class="menuLink" href="#">jewelry</a></li>
          <li><a class="menuLink" href="#">.etc</a></li>
          <li><a class="menuLink" href="#"></a></li>
      </ul>
    </nav>
    </div>
    </div>
    
</body>
</html>