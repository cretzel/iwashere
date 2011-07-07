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
	font-family: Times;
	color: #444;
	text-align:center;
}

#main-wrapper .title {
	font-size: 96px;
}
</style>
</head>
<body>
	<div id="main">
		<div id="main-wrapper">
			<div class="title">${message}</div>
		</div>
	</div>
</body>
</html>