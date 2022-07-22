"use strict";

const ListViewBtn = document.querySelector("#ListViewBtn");
const memberUpdateOkForm = document.querySelector("#memberUpdateOkForm");
const memberUpdateOkBtn = document.querySelector("#memberUpdateOkBtn");
const custNo = document.querySelector("#custNo");
const custName = document.querySelector("#custName");
const phone = document.querySelector("#phone");
const address = document.querySelector("#address");
const joinDate = document.querySelector("#joinDate");
const grade = document.querySelector("#grade");
const city = document.querySelector("#city");

ListViewBtn.addEventListener('click',()=>{
	
	location.href="memberListView.do";
});


memberUpdateOkBtn.addEventListener('click',()=>{
	
	if(custNo==null||custNo.value==""||custNo.value.length<=0){
		alert("회원번호를 확인해 주세요");
		custNo.focus();
		return false;
	}
	if(custName==null||custName.value==""||custName.value.length<=0){
		alert("회원이름를 확인해 주세요");
		custName.focus();
		return false;
	}
	if(phone==null||phone.value==""||phone.value.length<=0){
		alert("회원전화를 확인해 주세요");
		phone.focus();
		return false;
	}
	if(address==null||address.value==""||address.value.length<=0){
		alert("회원주소를 확인해 주세요");
		custNo.focus();
		return false;
	}
	if(joinDate==null||joinDate.value==""||joinDate.value.length<=0){
		alert("가입일자를 확인해 주세요");
		joinDate.focus();
		return false;
	}
	if(grade==null||grade.value==""||grade.value.length<=0){
		alert("고객등급을 확인해 주세요");
		grade.focus();
		return false;
	}
	if(city==null||city.value==""||city.value.length<=0){
		alert("도시코드를 확인해 주세요");
		city.focus();
		return false;
	}
	
	memberUpdateOkForm.submit();
});
