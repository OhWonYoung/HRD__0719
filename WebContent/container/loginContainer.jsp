<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="container">
	<div class="inner-container">
		<div class="login">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<form action="loginOk.do" method="post" id="loginOkForm">
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
											/>
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
								
								</tbody>
								<tfoot>
									<tr>
										<td colspan="2">
											<input type="button" value="로그인" id="loginOkBtn"  />
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