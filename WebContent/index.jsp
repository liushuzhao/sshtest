<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>校验用户注册信息</title>
</head>
<body>
	<s:form method="post" action="UserAction_add" id="form">
		<table>
			<tr>
				<td colspan="2" align="center">用户注册</td>
			</tr>
			<tr>

			</tr>
			<tr>
				<td><s:textfield name="user.username" label="用户名" id="username_id"></s:textfield></td>
			</tr>
			<tr>

				<td><s:password name="user.password" label="密码" id="pwd1_id"></s:password></td>
			</tr>
			<tr>
				<td><s:password name="repassword" label="再次输入密码" id="pwd2_id"></s:password></td>
			</tr>
			<tr>
				<td><s:textfield name="user.phone" label="电话" id="phone_id"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="user.email" label="邮箱" id="email_id"></s:textfield></td>
			</tr>
			<tr>
				<s:submit value="提交"></s:submit>
			</tr>
		</table>
	</s:form>
	<div style="color: red;">
			<s:fielderror />
	</div>
</body>
</html>
