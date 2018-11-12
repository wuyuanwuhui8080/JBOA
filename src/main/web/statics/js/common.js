function page_nav(from,pageIndex){
	if(typeof(from)!='object'){
		from=document.forms[0];
	}
	var pageNo = from.elements["pageSupport.pageNo"];
	pageNo.value = pageIndex;
	from.submit();
}

function jump_to(from,pageCount){
	if(typeof(from)!='object'){
		from=document.forms[0];
	}
    var regexp=/^\d+$/;
    var pageIndex = document.getElementById("pageIndex").value;
	if(!regexp.test(pageIndex)){
		alert('请输入正确的数字!');
		return false;
	}
	var pageNo = from.elements["pageSupport.pageNo"].value;
	if(pageIndex==pageNo){
		return false;
	}
	if(pageIndex>0 && pageIndex<=pageCount){
		page_nav(from,pageIndex);
		return true;
	}else{
	  alert('页号错误！');
	  return false;
	}
}