<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Attribute에 바인딩된 VO정보를 출력...</h2>
아이디 : ${vo.id}<br>
이름 : ${vo.name}<br>
주소 : ${vo.address}<br>
<hr>
<h2>Attribute에 바인딩된 List정보를 출력...</h2>
아이디 : ${list[0].id}<br>
이름 : ${list[0].name}<br>
주소 : ${list[0].address}<br>
1VO :: ${list[0]}<br>

아이디 : ${list[1].id}<br>
이름 : ${list[1].name}<br>
주소 : ${list[1].address}<br>
1VO :: ${list[1]}<br>
</body>
</html>