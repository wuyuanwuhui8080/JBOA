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
   	function delVoucher(id){
   		if(!confirm('确定删除报单吗')) return;
   		
   		document.claimVoucherForm.action = "claimVoucher!deleteClaimVoucherById.action?claimVoucher.id="+id;
   		document.claimVoucherForm.submit();
   		
   	}
   	
</script>
<div class="action  divaction">
	<div class="t">报销单列表</div>
	<div class="pages">
		<div class="forms">
			<s:form action="claimVoucher!searchClaimVoucher.action" name="queryForm">
	       		<label>报销单状态</label>
	  			<s:select name="condition.status" list="statusMap" 
	  				listKey="key" listValue="value" headerKey="" headerValue="全部" theme="simple"/>
		       	<label for="time">开始时间</label>
		       	<s:textfield name="condition.beginTime" id="startDate" cssClass="nwinput"/>
		       	<label for="end-time">结束时间</label>
		       	<s:textfield name="condition.endTime" id="endDate" cssClass="nwinput"/>
		       	<input type="hidden" name="pageSupport.pageNo" value="<s:property value="pageSupport.pageNo"/>"/>
			   	<input type="hidden" name="pageSupport.pageSize" value="<s:property value="pageSupport.pageSize"/>"/>
		       	<s:submit cssClass="submit_01" value="查询"/>
	       	</s:form>
	    </div>
		<table width="90%" border="0" cellspacing="0" cellpadding="0" class="list items">
	      <tr class="even">
	        <td>编号</td>
	        <td>填报日期</td>
	        <td>填报人</td>
	        <td>总金额</td>
	        <td>状态</td>
	        <td>待处理人</td>
	        <td>操作</td>
	      </tr>
	      <s:iterator value="claimVouchers" id="claimVoucher" begin="0" status="s">
	      <tr>
	        <td><a href="claimVoucher!getClaimVoucherById.action?claimVoucher.id=<s:property value="#claimVoucher.id"/>"><s:property value="#claimVoucher.id"/></a></td>
	        <td><s:date name="#claimVoucher.createTime"/></td>
	        <td><s:property value="#claimVoucher.sysEmployeeByCreateSn.name"/></td>
	        <td><s:property value="#claimVoucher.totalAccount"/></td>
	        <td><s:property value="#claimVoucher.status"/></td>
	        <td><s:property value="#claimVoucher.sysEmployeeByNextDealSn.name"/></td>
	        <td>
	        	<s:if test="#claimVoucher.status == '新创建' || #claimVoucher.status == '已打回'">
	        		<a href="claimVoucher!toUpdate.action?claimVoucher.id=<s:property value="#claimVoucher.id"/>">
			        	<img src="${images}/edit.gif" width="16" height="16" /> 
			        </a>
			        <a onClick="delVoucher(<s:property value="#claimVoucher.id"/>)" href="#">
			        	<img src="${images}/delete.gif" width="16" height="16" />
			        </a>
		        </s:if>
		        <img src="${images}/save.gif" width="16" height="16" /> 
		        <a href="claimVoucher!getClaimVoucherById.action?claimVoucher.id=<s:property value="#claimVoucher.id"/>">
		        	<img src="${images}/search.gif" width="16" height="15" />
		        </a>
		        <s:if test="#claimVoucher.sysEmployeeByNextDealSn.name == #session.employee.name">
		        	<s:if test="#claimVoucher.status == '已提交' || #claimVoucher.status == '待审批' || #claimVoucher.status == '已审批'">
				        <a href="claimVoucher!toCheck.action?claimVoucher.id=<s:property value="#claimVoucher.id"/>">
				         <img src="${images}/sub.gif" width="16" height="16" />
				        </a>
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
       </div>
      </div>