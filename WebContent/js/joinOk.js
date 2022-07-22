"use strict";

const ListViewBtn = document.querySelector("#ListViewBtn");
const joinOkForm = document.querySelector("#joinOkForm");
const joinOkBtn = document.querySelector("#joinOkBtn");
const custNo = document.querySelector("#custNo");
const custName = document.querySelector("#custName");
const phone = document.querySelector("#phone");
const address = document.querySelector("#address");
const joinDate = document.querySelector("#joinDate");
const grade = document.querySelector("#grade");
const city = document.querySelector("#city");



//ListViewBtn 버튼을 누르면 memberListView.do로 이동한다.
ListViewBtn.addEventListener('click',()=>{
	location.href="memberListView.do";
});

joinOkBtn.addEventListener('click',()=>{
	
	if(custNo==null||custNo.value==""||custNo.value.length<=0){
		alert("회원번호가 입력되지 않았습니다.");
		custNo.focus();
		return false;
	}
	if(custName==null||custName.value==""||custName.value.length<=0){
		alert("회원이름이 입력되지 않았습니다.");
		custName.focus();
		return false;
	}
	if(phone==null||phone.value==""||phone.value.length<=0){
		alert("전화번호가 입력되지 않았습니다.");
		phone.focus();
		return false;
	}
	if(address==null||address.value==""||address.value.length<=0){
		alert("회원주소가 입력되지 않았습니다.");
		address.focus();
		return false;
	}
	if(joinDate==null||joinDate.value==""||joinDate.value.length<=0){
		alert("가입일자가 입력되지 않았습니다.");
		joinDate.focus();
		return false;
	}
	if(grade==null||grade.value==""||grade.value.length<=0){
		alert("고객등급이 입력되지 않았습니다.");
		grade.focus();
		return false;
	}
	if(city==null||city.value==""||city.value.length<=0){
		alert("도시코드가 입력되지 않았습니다.");
		city.focus();
		return false;
	}
	
	
	alert("회원등록이 완료 되었습니다.");
	joinOkForm.submit();
});
