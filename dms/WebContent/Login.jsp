<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
<script>
function myFunction() {
    var url = window.location.href;
    url = url.split("?");
    if(url[1] !=null && url[1] != "")
    {
		url = url[1].split("=");
		url = url[1].replace(/[+]/g, " ");
		document.getElementById("demo").innerHTML = url;
	}
}
</script>
</head>
<body>
<br>
<br>
Session Expired.... Please Log In again...<br><br>
<form name="login" action="/vms/authenticateview.htm" method="POST">
Username :<input type="text" name="username" /><br>
Password :<input type="password" name="password" /><br>
<input type="submit" value="submit" name="submit"><br><br>

<span style="color:red;" id="demo"></span><br>
<script>
myFunction();
</script>
</form>
</body>
</html>