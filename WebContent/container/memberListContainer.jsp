<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.project.boardDto.Member_tbl_02"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<Member_tbl_02> list = (ArrayList<Member_tbl_02>)request.getAttribute("list");
String grade = "";
%>

<div class="container">
	<div class="inner-container">
		<div class="memberList">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
							<table>
								<thead>
										<tr>
											<th colspan="7">
												<h1>회원 목록 조회/수정</h1>
											</th>
										</tr>
										<tr>
										<th>회원번호</th>
										<th>회원성명</th>
										<th>회원전화</th>
										<th>회원주소</th>
										<th>가입일자</th>
										<th>고객등급</th>
										<th>도시코드</th>
									</tr>
								</thead>
								<tbody>
									<%for(Member_tbl_02 lists : list) {
										// 문자열
									//	String joinDate = lists.getJoinDate();
										//Date -> format
									//	SimpleDateFormat sfmt = new SimpleDateFormat("YYYY-MM-DD");
										//문자열 -> Date 변환
									//	Date date = sfmt.parse(joinDate);
									//	String joinDate2 = 
									%>
											<tr>
												<td class="a1"><a href="memberView.do?custNo=<%=lists.getCustNo() %>"><%=lists.getCustNo() %></a></td>					
												<td><%=lists.getCustName() %></td>					
												<td><%=lists.getPhone() %></td>					
												<td><%=lists.getAddress() %></td>					
												<td><%=lists.getJoinDate() %></td>					
												<td>
												<%if(lists.getGrade().equals("A"))grade="VIP";
												if(lists.getGrade().equals("B"))grade="일반";
												if(lists.getGrade().equals("C"))grade="직원"; %>
												<%=grade %>
												</td>					
												<td><%=lists.getCity() %></td>					
											
											
											
											</tr>
									<% } %>
								</tbody>
								<tfoot>
								</tfoot>
							</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>