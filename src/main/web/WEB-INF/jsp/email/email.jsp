<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="width: 400px;">
	<s:form action="Email!uploading.action" enctype="multipart/form-data"
		method="post">
		<table>
			<tr>
				<td colspan="2"><h3>邮件发送</h3>
				</td>
			</tr>
			<tr>
				<td>发件人:</td>
				<td><s:textfield name="mail.from" />
				</td>
			</tr>
			<tr>
				<td>收件人:</td>
				<td><s:textfield name="mail.to" />
				</td>
			</tr>
			<tr>
				<td>主&nbsp;&nbsp;题:</td>
				<td><s:textfield name="mail.mailSubject" />
				</td>
			</tr>
			<tr>
				<td>附&nbsp;&nbsp;件:</td>
				<td><s:file name="upload" title="请选择附件" />
				</td>
			</tr>
			<tr>
				<td>内&nbsp;&nbsp;容:</td>
				<td><s:textarea name="mail.mailContent"
						cssStyle="width:500px;height:200px; font:600 40px/40px 隶书;"
						value="此邮件发送功能模块，暂未实现" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><s:submit value="发送邮件" /></td>
			</tr>
		</table>
	</s:form>
</div>