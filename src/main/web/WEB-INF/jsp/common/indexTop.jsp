<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<div class="top">
	<div class="global-width">
		<img src="images/logo.gif" class="logo" />
	</div>
</div>
<script type="text/javascript">
	function out(){
		if(confirm('您确定要退出系统吗？')){
			window.location="user!out.action";
			return true;
		}else{
			return false;
		}
	};
</script>
<div class="status">
	<div class="global-width">
		<span class="usertype">【登录角色：${sessionScope.employee.sysPosition.nameCn}】</span>${sessionScope.employee.name}你好！欢迎访问青鸟办公管理系统！
		<span><a onclick="return out()" href="">退出系统</a></span>
	</div>
</div>
