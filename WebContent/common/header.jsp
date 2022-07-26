<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sessionCustName = (String) session.getAttribute("sessionId");
%>
<div class="header">
	<div class="inner-header">
		<div class="nav">
			<div class="top-nav">쇼핑몰 회원관리 ver1.0</div>
			<div class="bottom-nav">
				<div class="gnb">
					<ul>
						<li><a href="index.do">HOME</a></li>
						<%
							if (sessionCustName == null) {
						%>
						<li><a href="joinView.do">회원등록</a></li>
						<li><a href="loginView.do">로그인</a></li>
						<%
							} else {
						%>
						<li><a href="memberListView.do">회원목록/조회</a></li>
						<li><a href="memberSalesView.do">회원매출조회</a></li>
						<li><a href="logoutOk.do">로그아웃</a></li>
						<%
							if (sessionCustName.equals("admin")) {
						%>
						<li><a href="admin_main.do">관리자 페이지</a></li>
						<li><%=sessionCustName%> 님</li>
						<%
							} else {
						%>
						<li><a href="admin_main.do">일반 페이지</a></li>
						<li><%=sessionCustName%> 님</li>

						<%
							}
							}
						%>

					</ul>
				</div>
			</div>
		</div>
	</div>
</div>