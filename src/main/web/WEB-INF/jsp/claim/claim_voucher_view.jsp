<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>北大青鸟办公自动化管理系统</title>
		<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />
	</head>
<body>
<form id="myForm" name="myForm" method="post" >
    <div class="action  divaction">
    	<div class="t">查看报销单</div>
   		<div class="pages">
        	<!--增加报销单 区域 开始-->
                <table width="90%" border="0" cellspacing="0" cellpadding="0" class="addform-base">
                  <caption>基本信息</caption>
                  <tr>
                  	<td >编&nbsp;&nbsp;号：<s:property value="claimVoucher.id"/></td>
                    <td>填&nbsp;写&nbsp;人：<s:property value="claimVoucher.sysEmployeeByCreateSn.name"/></td>
                    <td>部&nbsp;&nbsp;门：<s:property value="claimVoucher.sysEmployeeByCreateSn.sysDepartment.name"/></td>
                    <td>职&nbsp;&nbsp;&nbsp;&nbsp;位：<s:property value="claimVoucher.sysEmployeeByCreateSn.sysPosition.nameCn"/></td>
                  </tr>
                  <tr>
                    <td>总金额：<s:property value="claimVoucher.totalAccount"/></td>
                    <td>填报时间：<s:date name="claimVoucher.createTime" format="yyyy-MM-dd hh:mm:ss"/></td>
                    <td>状态：<s:property value="claimVoucher.status"/></td>
                    <td>待处理人：<s:property value="claimVoucher.sysEmployeeByNextDealSn.name"/></td>
                  </tr>
                  <tr>
                  	<td colspan="4"><p>-------------------------------------------------------------------------------</p></td>
                  </tr>
                </table>
          <p>&nbsp;</p>
                <table width="90%" border="0" cellspacing="0" cellpadding="0" class="addform-base">
                  <tr>
                    <td>项目类别</td>
                    <td>项目金额</td>
                    <td>费用说明</td>
                  </tr>
                <s:iterator value="claimVoucher.bizClaimVoucherDetails" id="claimDetail" begin="0" status="s">
				<tr>
					<td><s:property value="#claimDetail.item"/></td>
					<td>￥<s:property value="#claimDetail.account"/></td>
					<td><s:property value="#claimDetail.des"/></td>
				</tr>
				</s:iterator>
      </table>
      <p>&nbsp;</p>
      <p>-------------------------------------------------------------------------------</p>
      
      <table width="90%" border="0" cellspacing="0" cellpadding="0" class="addform-base">
      	<s:iterator value="claimVoucher.bizCheckResults" id="checkResult" begin="0" status="s">
         <tr>
           <td width="27%"><s:property value="#checkResult.sysEmployee.name" />(<s:property value="#checkResult.sysEmployee.sysPosition.nameCn" />)</td>
           <td width="20%"><s:date name="#checkResult.checkTime" format="yyyy-MM-dd hh:mm:ss"/></td>
           <td width="38%">审核：<span class="red"><strong><s:property value="#checkResult.result" /></strong></span></td>
         </tr>
         <tr>
           <td>审核意见：<strong><s:property value="#checkResult.comm" /></strong></td>
           <td>&nbsp;</td>
           <td>&nbsp;</td>
         </tr>
         <tr>
         	<td colspan="3">
         		<p>-------------------------------------------------------------------------------</p>
           	</td>
         </tr>
         </s:iterator>
         
    </table>
    <p>&nbsp;</p>
   
    <p>&nbsp;</p>
    <p><input type="button" value="返回" onclick="javascript:history.go(-1)" class="submit_01"/></p>       
<!--增加报销单 区域 结束-->
        </div>
    </div>
</form>
</body>