<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title><tiles:insertAttribute name="title" ignore="true" /></title>  
</head>  
<body>  
        <div><tiles:insertAttribute name="header" /></div>  
        <div style="float:left;padding:10px;width:20%;border-right:1px solid pink;color: #0d99e2;"><tiles:insertAttribute name="menu" /></div>  
        <div style="float:left;padding:10px;width:80%;">  
        <tiles:insertAttribute name="body" /></div>  
        <div style="clear:both"><tiles:insertAttribute name="footer" /></div>  
  
</body>  
</html>  