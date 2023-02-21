<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.util.*"@>
    
<@ taglib prefix="c", uri="http://java.sun.com/jsp/jst1/core"@>
<!DOCTYPE html PUBLIC="-//W3C/DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    Date and Time now is:<@=new Date()@>
    <br>
    <c: out value="Hi from JSP"></c:out>
</body>
</html>
