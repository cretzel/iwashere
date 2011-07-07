<#import "spring.ftl" as spring />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello CloudFoundry</title>
<style type="text/css">
#main {
	
	margin: 0 auto;
	width: 800px;
}

#main-wrapper {
	margin-top: 50px;
	color: #444;
	font-family: Arial;
	text-align:center;
}

#main-wrapper .title {
	font-size: 96px;
	color: #555;
	font-family: Times;
}
</style>
</head>
<body>
	<div id="main">
		<div id="main-wrapper">
			<div class="title">I Was Here!</div>
			
			<table border="0" style="margin:0 auto">
			<form method="POST">
				<tr>
					<td>${new.date?datetime} - </td>
					<td><@spring.formInput "new.name", "", "text"/><input type="submit" value="Me too!"/></td>
				</tr>
				<tr>
					<td></td>
					<td><@spring.showErrors "<br/>", ""/></td>
				</tr>
			</form> 
			
			<#list wasHeres as wasHere>
				<tr><td>${wasHere.date?datetime} - </td><td align="left">${wasHere.name}</td></tr>
			</#list>
			</table>

		</div>
	</div>
</body>
</html>