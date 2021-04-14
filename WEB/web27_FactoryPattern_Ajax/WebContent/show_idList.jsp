<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr;
	function startRequest(){//비동기 요청을 처리하는 로직
		xhr = new XMLHttpRequest();
		var id = document.getElementById("memberId").value;
		
		xhr.onreadystatechange = callback;
		xhr.open("post","find.do");
		
		xhr.setRequestHeader("Content-Type", 
		"application/x-www-form-urlencoded;charset=utf-8");
		xhr.send("id="+id);
	}
	function callback(){//비동기 응답을 처리하는 로직
		if(xhr.readyState==4){//xhr객체가 안전하게 브라우저로 다시 잘 안착했다면...완벽하게 도착했다면
			if(xhr.status==200){//서버로 가서 작업한 일이 성공적으로 수행되었다면
				document.getElementById("resultView").innerHTML=
					"<font color='green' size=3>"+xhr.responseText+"</font>";
		
		}
	}
}
</script>
</head>
<body>
<h2 align="center">ID LIST INFORMATION...</h2><br>
<h3 align="center">list에서 특정 아이디를 선택해주세여....</h3>
<p></p>

<select onchange="startRequest()" id = "memberId">
	<option value="">======ID CHOICE=====</option>
	<c:forEach items="${list}" var="memId">
		<option value="${memId}">${memId}</option>
	</c:forEach>	
</select>

<span id="resultView"></span>
</body>
</html>