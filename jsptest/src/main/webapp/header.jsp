<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style.css" rel="stylesheet">
</head>
<body>
	<header class="header">
		<div class="header-logo">
			<a href="main.jsp"><img src="/logo.png" alt=""
				class="main-logo"></a>
		</div>
		<div class="nav-container">
			<nav class="header-nav">
				<ul class="nav-ul">
					<li class="nav-li"><a href="testschedule.jsp">시험일정</a></li>
					<li class="nav-li"><a href="calendar.jsp">캘린더</a></li>
					<li class="nav-li dropdown">커뮤니티
						<div class="dropdown-content">
							<a href="freeboard.jsp">자유게시판</a>
                    <a href="testboard.jsp">시험문제공유</a>
                    <a href="onelineboard.jsp">시험 한줄평</a>
						</div>
					</li>
				</ul>
			</nav>
			<nav class="header-nav">
				<ul class="nav-ul">
					<li class="nav-li">로그인</li>
					<li class="nav-li">회원가입</li>
					<li class="nav-li bg-box">마이페이지</li>
				</ul>
			</nav>
		</div>
	</header>
</body>
</html>