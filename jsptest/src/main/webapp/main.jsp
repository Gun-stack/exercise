<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="style.css" rel="stylesheet">
    <title>main</title>
</head>
<body>
    <header class="header">
        <div class="header-logo">
            <a href="#"><img src="logo.png" alt="" class="main-logo"></a>
        </div>
        <div class="nav-container">
        <nav class="header-nav">
            <ul class="nav-ul">
                <li class="nav-li"><a href="testschedule.jsp">시험일정</a></li>
                <li class="nav-li"><a href="calender.jsp">캘린더</a></li>
                <li class="nav-li dropdown">
                        커뮤니티
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
                <li class="nav-li"><a href="login.jsp">로그인</a></li>
                <li class="nav-li">로그아웃</a></li>
                <li class="nav-li bg-box"><a href="mypage.jsp">마이페이지</a></li>
            </ul>
        </nav>
        </div>
    </header>
    <main class="main">

        <section class="search-section">
            <form action="#" method="post" class="search-form">
                <input type="search" name="search" class="input-search">
                <button class="search-btn"><i class="fas fa-search"></i></button>
            </form>
        </section>

        <section class="info-section">
            <div class="info-box-container">
            <div class="main-info-box">
                <div class="main-info-title">정보처리기사</div>
                <div>필기평균 합격률</div>
                <div>정보처리기사</div>
                <div>필기평균 합격률</div>
            </div>
            <div class="main-info-box slide-box">
                <div class="main-info-title">정보처리기사</div>
                <div>필기평균 합격률</div>
                <div>정보처리기사</div>
                <div>필기평균 합격률</div>
                <i class="fas fa-chevron-left icon-left"></i>
                <i class="fas fa-chevron-right icon-right"></i>
            </div>
            </div>
        </section>


    </main>

    <footer class="footer">

    </footer>

    <script src="https://kit.fontawesome.com/ad2be14d60.js" crossorigin="anonymous"></script>    
</body>
</html>