<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript">
	$(function(){
		$("#pageSize").change(function(){
			var pageSize = document.forms[0].elements["pageSupport.pageSize"];
			pageSize.value = $(this).val();
			document.forms[0].submit();
		});
	});
</script>
<div class="page-bar" style="height: 10px;">
	<div style="float: left;">设置每页显示数量：
		<select id="pageSize">
			<option value="5">5</option>
			<c:choose>
				<c:when test="${param.pageSize==10 }">
					<option value="10" selected="selected">10</option>
					<option value="15">15</option>
				</c:when>
				<c:when test="${param.pageSize==15 }">
					<option value="10">10</option>
					<option value="15" selected="selected">15</option>
				</c:when>
				<c:otherwise>
					<option value="10">10</option>
					<option value="15">15</option>
				</c:otherwise>
			</c:choose>
		</select>
		输入页码：
		<input type="text" id="pageIndex" style="width: 25px;" /> 
		<button style="height: 30px;" onclick="javascript:jump_to(${param.formName},<c:out value="${param.totalPageCount}"/>);">跳转</button>
	</div>
	<div style="float: right;">
		<c:if test="${param.currentPageNo>1}">
			<a href="javascript:page_nav(${param.formName},1);">首页</a>  
			<a href="javascript:page_nav(${param.formName},<c:out value="${param.currentPageNo-1}"/>);">上一页</a>
		</c:if>
		<c:if test="${currentPageNo<=1}">
			首页&nbsp;&nbsp;上一页
		</c:if>
		<c:if test="${param.currentPageNo<param.totalPageCount}">
			<a href="javascript:page_nav(${param.formName},<c:out value="${param.currentPageNo+1}" />);">下一页</a>
			<a href="javascript:page_nav(${param.formName},<c:out value="${param.totalPageCount}"/>);">最后一页</a>
		</c:if> 
		<c:if test="${param.currentPageNo>=param.totalPageCount}">
			下一页&nbsp;&nbsp;尾页
		</c:if>&nbsp;&nbsp;
		&nbsp;&nbsp;第 ${param.currentPageNo}页/共${param.totalPageCount}页&nbsp;&nbsp;共${param.totalRecordCount }条记录
	</div>
</div>