<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>北大青鸟办公自动化管理系统</title>
<link href="<%=request.getContextPath()%>/css/style.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	$(function() {
		//日期选择控件
		$("#startDate").click(function() {
			WdatePicker({
				dateFmt : 'yyyy-MM-dd HH:mm:ss',
				maxDate : '#F{$dp.$D(\'endDate\')}',
				isShowClear : true,
				readOnly : true
			});
		});
		$("#endDate").click(function() {
			WdatePicker({
				dateFmt : 'yyyy-MM-dd HH:mm:ss',
				minDate : '#F{$dp.$D(\'startDate\')}',
				isShowClear : true,
				readOnly : true
			});
		});
	});
	function submitLeave() {
		if (!confirm('确定提交请假申请吗'))
			return;
		document.leaveForm.submit();

	}
</script>
</head>
<body>
	<div class="action divaction">
		<div class="t">请假申请</div>
		<div class="pages">
			<!--请假申请 区域 开始-->
			<s:form action="leave!submitLeave.action" name="leaveForm">
				<input type="hidden" name="basePath" value="<%= basePath%>"/>
				<table class="leave"> 
					<tr>
						<td class="width1"><label for="name">姓名：</label></td>
						<td class="width2"><s:property value="%{#session.employee.name}"/></td>
						<s:hidden name="leave.sysEmployeeByEmployeeSn.sn" value="%{#session.employee.sn}"/>
						<td class="width1"><label>部门：</label></td>
						<td class="width2">
							<select name="" class="nwselect">
								<option value="<s:property value="%{#session.employee.sysDepartment.id}"/>">
									<s:property value="%{#session.employee.sysDepartment.name}" />
								</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="width1"><label for="time">开始时间：</label></td>
						<td class="width2"><s:textfield name="leave.starttime"
								id="startDate" cssClass="nwinput" /></td>
						<td class="width1"><label for="end-time">结束时间：</label></td>
						<td class="width2"><s:textfield name="leave.endtime"
								id="endDate" cssClass="nwinput" /></td>
					</tr>
					<tr>
						<td class="width1"><label for="size">请假天数：</label></td>
						<td class="width2"><s:textfield name="leave.leaveday"
								cssClass="nwinput" />(天)</td>
						<td class="width1"><label>休假类型：</label></td>
						<td class="width2"><s:select name="leave.leavetype"
								list="leaveTypeMap" listKey="key" listValue="value"
								theme="simple" cssClass="nwselect"></s:select>
						</td>
					</tr>
					<tr>
						<td class="width1"><label>请假事由：</label></td>
						<td colspan="3"><s:textarea name="leave.reason"
								cssClass="textarea"></s:textarea>
						</td>
					</tr>
					<tr>
						<td class="width1"><label>下一审批人：</label></td>
						<td colspan="3">
							<select name="leave.sysEmployeeByNextDealSn.Sn" class="nwselect">
								<option value="<s:property value="manager.sn"/>">
									<s:property value="manager.name" />
								</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="marg" colspan="4" align="center">
							<input name="button" type="button" value="提交流程" class="submit_01" 
								style="width: 103px; margin-right: 20px;" onclick="submitLeave()" /> 
							<input name="" type="button" value="取消" class="submit_01" 
								style="width: 101px;" onclick="javascript:history.go(-1)" />
						</td>
					</tr>
				</table>
			</s:form>
			<!--请假申请 区域 结束-->
		</div>
	</div>
</body>
</html>
