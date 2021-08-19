<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<c:forEach items="${students}" var="s">
		${s.name}<br/>
	</c:forEach>
	
	<c:set var="str" value="Navin Reddy is a Java Trainer"/>
	
	Length : ${fn:length(str)}
	
	<c:forEach items="${fn:split(str,'')}" var="s">
		
		
		<br>
		${s}
		
		
	</c:forEach>
	

</body>
</html>