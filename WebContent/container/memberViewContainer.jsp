<%@page import="org.project.boardDto.Member_tbl_02"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	Member_tbl_02 memberView = (Member_tbl_02) request.getAttribute("memberView");
%>
<div class="container">
	<div class="inner-container">
		<div class="memberView">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<form action="memberUpdateOk.do" method="post" id="memberUpdateOkForm">
							<table>
								<thead>
									<tr>
										<th colspan="2">
											<h1>홈쇼핑 회원 정보 수정</h1></th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<label for="custNo">회원번호(수정불가)</label>
										</td>
										<td>
											<input type="hidden" name="custNo" id="custNo" size="8" maxlength="6"
												value="<%=memberView.getCustNo()%>" />
												<span><%=memberView.getCustNo() %></span>
										</td>
									</tr>
									<tr>
										<td>
											<label for="custName">회원성명</label>
										</td>
										<td>
											<input type="text" name="custName" id="custName" size="8" maxlength="8"
											value="<%=memberView.getCustName()%>"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="phone">회원전화</label>
										</td>
										<td>
											<input type="text" name="phone" id="phone" size="13" maxlength="13"
											placeholder="010-xxxx-xxxx"
											value="<%=memberView.getPhone()%>"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="address">회원주소</label>
										</td>
										<td>
											<input type="text" name="address" id="address" size="30" 
											value="<%=memberView.getAddress()%>"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="joinDate">가입일자(수정불가)</label>
										</td>
										<td>
											<input type="hidden" name="joinDate" id="joinDate" size="8"
											value="<%=memberView.getJoinDate()%>"/>
											<span><%=memberView.getJoinDate()%></span>
										</td>
									</tr>
									<tr>
										<td>
											<label for="grade">고객등급[A:VIP,B:일반,C:직윈]</label>
										</td>
										<td>
											<input type="text" name="grade" id="grade" size="8"
											placeholder="A, B, C" value="<%=memberView.getGrade()%>"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="city">도시코드</label>
										</td>
										<td>
											<input type="text" name="city" id="city" size="8"
											value="<%=memberView.getCity()%>"/>
										</td>
									</tr>
								</tbody>
								<tfoot>
									<tr>
										<td colspan="2">
											<input type="button" value="수정" id="memberUpdateOkBtn"  />
											<input type="button" value="조회" id="ListViewBtn"  />
										</td>
									</tr>
								</tfoot>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>