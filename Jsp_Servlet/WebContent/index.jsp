<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*, java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/styles.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%
		// Set refresh, autoload time as 5 seconds
		//response.setIntHeader("Refresh", 5);
	%>

	<div id="header">
		<img alt="" src="resources/images/logo_transforma.png">
	</div>
	<br />
	<div class="indexmessage">
		<div class="product-info wise">
			<div class="product-headers">
				<h1 class="redtext">Author Proofing System</h1>
				<h2>Welcome to Transforma Author Proofing System</h2>
			</div>
			<div class="drive-intro">
				<br>
				<table style="width: 100%">
					<tr>
						<td style="width: 53px"><img alt="" height="37"
							src="resources/images/icon-editor.png" width="37"></td>
						<td><label id="Label2"
							style="color: #333333; font-size: medium;"> Latex WYSIWYG
								Editor<br>
						</label><label id="Label3">Modify content by Author</label></td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td style="width: 53px">&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td style="width: 53px"><img alt="" height="37"
							src="resources/images/icon-logfile.jpg" width="37"></td>
						<td><label id="Label4"
							style="font-size: medium; color: #333333"> Changes Log
								Tracking<br>
						</label><label id="Label5">Track history of changes</label></td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td style="width: 53px">&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td style="width: 53px"><img alt="" height="37"
							src="resources/images/icon-roles.png" width="37"></td>
						<td><label id="Label6"
							style="font-size: medium; color: #333333"> User Access
								Control<br>
						</label><label id="Label7">Role based features</label></td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td style="width: 53px">&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td style="width: 53px"><img alt="" height="37"
							src="resources/images/icon-transfer.png" width="37"></td>
						<td><label id="Label8"
							style="font-size: medium; color: #333333"> Latex Transfer<br>
						</label><label id="Label9">Import/Export Latex file</label></td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<br> <br>

			</div>
		</div>

		<div class="container">
			<div id="login-form">
				<h3>Sign in</h3>
				<fieldset>
					<%-- <form action="${pageContext.request.contextPath}/welcome" method="POST"> --%>
					<form action="Welcome.do" method="POST">
						User-id <br> <input type="text"
							placeholder="Username" name="name"><br> 
						password <br> <input type="password" placeholder="password"
							name="password"><br> <input type="submit"
							value="login">
					</form>
				</fieldset>
			</div>
		</div>
	</div>
</body>
</html>