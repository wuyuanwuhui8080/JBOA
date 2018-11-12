<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script>
	$(function(){
			 //日期选择控件
		 	$("#startDate").click(function(){
				WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',maxDate:'#F{$dp.$D(\'endDate\')}',isShowClear:true, readOnly:true });
			});
			$("#endDate").click(function(){
				WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'startDate\')}',isShowClear:true, readOnly:true });
			});
		});
</script>
<div class="action  divaction">
	<div class="t">请假列表</div>
	<div class="pages">
		<div class="forms">
		<s:form action="leave!searchLeave.action" name="queryForm">
	       <label for="time">开始时间</label>
	       <s:textfield name="condition.beginTime" id="startDate" cssClass="nwinput"></s:textfield>
	       <label for="end-time">结束时间</label>
	       <s:textfield name="condition.endTime" id="endDate" cssClass="nwinput"></s:textfield>
	       <input type="hidden" name="pageSupport.pageNo" value="<s:property value="pageSupport.pageNo"/>"/>
		   <input type="hidden" name="pageSupport.pageSize" value="<s:property value="pageSupport.pageSize"/>"/>
		   <s:submit cssClass="submit_01" value="查询"/>
	     </s:form>
	     </div>
	<!--增加报销单 区域 开始-->
		<table width="90%" border="0" cellspacing="0" cellpadding="0" class="list items">
	      <tr class="even">
	        <td>编号</td>
	        <td>名称</td>
	        <td>发起时间</td>
	        <td>审批时间</td>
	        <td>审批意见</td>
	        <td>审批状态</td>
	        <td>操作</td>
	      </tr>
	      <s:iterator value="leaveList" id="leave" begin="0" status="s">
	      <tr>
	        <td><a href="leave!getLeaveById.action?leave.id=<s:property value="#leave.id"/>"><s:property value="#leave.id"/></a></td>
	        <td><s:property value="#leave.sysEmployee.name"/>请假<s:property value="#leave.leaveday"/>天</td>
	        <td><s:date name="#leave.createtime" format="yyyy-MM-dd HH:mm"/></td>
	        <td><s:date name="#leave.modifytime" format="yyyy-MM-dd HH:mm"/></td>
	        <td><s:property value="#leave.approveOpinion"/></td>
	        <td><s:property value="#leave.status"/></td>
	        <td>
	       	 <a href="leave!getLeaveById.action?leave.id=<s:property value="#leave.id"/>"><img src="${images}/search.gif" width="16" height="15" /></a>
	       	  <s:if test="#leave.sysEmployeeByNextDealSn.name == #session.employee.name">
		        <s:if test="#leave.status == '待审批'">
	       	 		<a href="leave!toCheck.action?leave.id=<s:property value="#leave.id"/>">
	       	 		<img src="${images}/sub.gif" width="16" height="16" /></a> 
	       	 	</s:if>
	       	 </s:if>
	        </td>
	      </tr>
	      </s:iterator>
	      <tr>
	        <td colspan="7">
		      	<c:import url="../common/rollPage.jsp" charEncoding="UTF-8">
				<c:param name="formName" value="document.forms[0]"/>
				<c:param name="totalRecordCount" value="${pageSupport.countNum }"/>
				<c:param name="totalPageCount" value="${pageSupport.totalNum }"/>
				<c:param name="currentPageNo" value="${pageSupport.pageNo }"/>
				<c:param name="pageSize" value="${pageSupport.pageSize }"/>
  			</c:import> 
  		  	</td>
  		  </tr>
	    </table>        
	          <!--请假 区域 结束-->
       </div>
      </div>