function loginCheck() {
	if(document.frm.mem_id.value.length == 0) {
		alert("아이디를 써주세요.");
		frm.mem_id.focus();
		return false;
	}
	if(document.frm.mem_pw.value == "") {
		alert("암호는 반드시 입력해야 합니다.");
		frm.mem_pw.focus();
		return false;
	}
	return true;
}

function idCheck() {
	if (document.frm.mem_id.value == "") {
		alert('아이디를 입력해 주십시오.');
		document.frm.mem_id.focus();
		return;
	}
	if (document.frm.mem_id.value.length < 4) {
		alert('아이디는 4글자 이상이어야 합니다.');
		document.frm.mem_id.focus();
		return;
	}
	var url = "idCheck.do?mem_id=" + document.frm.mem_id.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}

function idok() {
	opener.frm.mem_id.value=document.frm.mem_id.value;
	opener.frm.reid.value=document.frm.mem_id.value;
	self.close();
}

function joinCheck() {
	if (document.frm.mem_id.value == "") {
		alert('아이디를 입력해 주십시오.');
		document.frm.mem_id.focus();
		return false;
	}
	if (document.frm.mem_id.value.length < 4) {
		alert("아이디는 4글자이상이어야 합니다.");
		frm.mem_id.focus();
		return false;
	}
	if (document.frm.mem_pw.value == "") {
		alert("암호는 반드시 입력해야 합니다.");
		frm.mem_pw.focus();
		return false;
	}
	if (document.frm.mem_pwcheck.value == "") {
		alert("암호확인은 반드시 입력해야 합니다.");
		frm.mem_pwcheck.focus();
		return false;
	}
	if (document.frm.mem_name.value.length == 0) {
		alert("이름을 써주세요.");
		frm.mem_name.focus();
		return false;
	}
	if (document.frm.mem_nickname.value.length == 0) {
	alert("닉네임을 써주세요.");
	frm.mem_nickname.focus();
	return false;
	}
	if (document.frm.mem_addr.value.length == 0) {
	alert("주소를 써주세요.");
	frm.mem_addr.focus();
	return false;
	}
	if (document.frm.mem_phone.value.length == 0) {
	alert("핸드폰 번호를 써주세요.");
	frm.mem_phone.focus();
	return false;
	}	
	if (document.frm.mem_pw.value != document.frm.mem_pwcheck.value) {
		alert("암호가 일치하지 않습니다.");
		frm.mem_pw.focus();
		return false;
	}
	if (document.frm.reid.value.length == 0) {
		alert("중복 체크를 하지 않았습니다.");
		frm.mem_id.focus();
		return false;
	}
	return true;				
}

function idSearch() { 
	 	if (document.frm.mem_name.value.length < 1) {
		  alert("이름을 입력해주세요.");
		  document.frm.mem_name.focus();
		  return;
		 }

		 if (document.frm.mem_phone.value.length != 11) {
			  alert("핸드폰번호를 정확하게 입력해주세요.");
			  document.frm.mem_phone.focus();
	    return;
		 }

		 frm.method = "get";
		 frm.action = "findidresult.do"; //넘어간화면
	 	 frm.submit();
}

function pwSearch() { 
	 	if (document.frm.mem_id.value.length < 4) {
		  alert("아이디는 4글자 이상이어야 합니다.");
		  document.frm.mem_id.focus();
		  return;
		 }

		 if (document.frm.mem_phone.value.length != 11) {
			  alert("핸드폰번호를 정확하게 입력해주세요");
			  document.frm.mem_phone.focus();
	    return;
		 }

		 frm.method = "get";
		 frm.action = "findpwresult.do"; //넘어간화면
	 	 frm.submit();
}