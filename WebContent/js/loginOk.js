"use strict";

const loginOkForm = document.querySelector("#loginOkForm");
const loginOkBtn = document.querySelector("#loginOkBtn");
const custNo = document.querySelector("#custNo");
const custName = document.querySelector("#custName");


loginOkBtn.addEventListener('click',()=>{
	
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
		
	alert("로그인 실행~");
	loginOkForm.submit();
});
