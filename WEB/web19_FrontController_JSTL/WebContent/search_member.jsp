<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center"><b>Finding Member...By id</b></h2><p>
<form action="front.do" method="get" name="findForm">
	<input type="hidden" name="command" value="find">
	ID : <input type="text" name="id" required="required">
	<input type="submit" value="Search">			

</form>
</body>
</html>














