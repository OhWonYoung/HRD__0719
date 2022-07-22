<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	// 스크립트릿
	int custNo = (Integer) request.getAttribute("custNo");
%>
<div class="container">
	<div class="inner-container">
		<div class="join">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<form action="joinOk.do" method="post" id="joinOkForm">
							<table>
								<thead>
									<tr>
										<th colspan="2">
											<h1>홈쇼핑 회원 등록</h1></th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<label for="custNo">회원번호(자동발생)</label>
										</td>
										<td>
											<input type="text" name="custNo" id="custNo" size="8" maxlength="6"
												value="<%=custNo%>" />
										</td>
									</tr>
									<tr>
										<td>
											<label for="custName">회원성명</label>
										</td>
										<td>
											<input type="text" name="custName" id="custName" size="8" maxlength="8"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="phone">회원전화</label>
										</td>
										<td>
											<input type="text" name="phone" id="phone" size="13" maxlength="13"
											placeholder="010-xxxx-xxxx"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="address">회원주소</label>
										</td>
										<td>
											<input type="text" name="address" id="address" size="30" />
										</td>
									</tr>
									<tr>
										<td>
											<label for="joinDate">가입일자</label>
										</td>
										<td>
											<input type="text" name="joinDate" id="joinDate" size="8"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="grade">고객등급[A:VIP,B:일반,C:직윈]</label>
										</td>
										<td>
											<input type="text" name="grade" id="grade" size="8"
											placeholder="A, B, C"/>
										</td>
									</tr>
									<tr>
										<td>
											<label for="city">도시코드</label>
										</td>
										<td>
											<input type="text" name="city" id="city" size="8"/>
										</td>
									</tr>
								</tbody>
								<tfoot>
									<tr>
										<td colspan="2">
											<input type="button" value="등록" id="joinOkBtn"  />
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