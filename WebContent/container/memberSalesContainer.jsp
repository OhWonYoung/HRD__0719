<%@page import="org.project.boardDto.memberSaleDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<memberSaleDto> memberSales = (ArrayList<memberSaleDto>) request.getAttribute("memberSales");
String grade = "";
%> 
<div class="container">
	<div class="inner-container">
		<div class="memberSales">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
							<table>
								<thead>
									<tr>
										<th colspan="5">
											<h1>회원 매출 조회</h1>
										</th>
									</tr>
									<tr>
										<th>회원번호</th>
										<th>회원성명</th>
										<th>고객등급</th>
										<th>매출</th>
										<th>상세보기</th>
									</tr>
								</thead>
								<tbody>
									<%for(memberSaleDto sale : memberSales){%>
									<tr>
										<td>
										<%=sale.getCustNo() %>
										
										</td>
										<td><%=sale.getCustName() %></td>
										<td>
										<%
										if(sale.getGrade().equals("A"))grade = "VIP"; 
										if(sale.getGrade().equals("B"))grade = "일반"; 
										if(sale.getGrade().equals("C"))grade = "직원";
										%>
										<%=grade %>
										</td>
										<td><%=sale.getPrice() %></td>
										<td><a href="memberSalesList.do?custNo=<%= sale.getCustNo()%>">조회</a></td>
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