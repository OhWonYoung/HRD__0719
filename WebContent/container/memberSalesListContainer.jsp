<%@page import="org.project.boardDto.memberSaleDto2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ArrayList<memberSaleDto2> salesList2 = (ArrayList<memberSaleDto2>)request.getAttribute("salesList2");
String grade = "";
%> 
<div class="container">
	<div class="inner-container">
		<div class="memberSalesList">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
							<table>
								<thead>
									<tr>
										<th colspan="6">
											<h1>회원 매출 상세조회</h1>
										</th>
									</tr>
									<tr>
										<th>회원번호</th>
										<th>회원성명</th>
										<th>고객등급</th>
										<th>매출</th>
										<th>상품코드</th>
										<th>판매일</th>
									</tr>
								</thead>
								<tbody>
									<tr>
									<%for(memberSaleDto2  list : salesList2){ %>
										<td><%=list.getCustNo()%></td>
										<td><%=list.getCustName() %></td>
										<td>
										<%
										if(list.getGrade().equals("A"))grade = "VIP"; 
										if(list.getGrade().equals("B"))grade = "일반"; 
										if(list.getGrade().equals("C"))grade = "직원";
										%>
										<%=grade %>
										</td>
										<td><%=list.getPrice() %></td>
										<td><%=list.getPcode() %></td>
										<td><%=list.getsDate() %></td>
									</tr>
										<%} %>
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