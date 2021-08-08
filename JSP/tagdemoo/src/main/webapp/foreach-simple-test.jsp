<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	// just create some saple data ... normally provided my MVC
	String[] cities = {"Mumbai", "Athens", "Tirana"};

	pageContext.setAttribute("myCities", cities);
	

%>

<html>
<body>

	<c:forEach var="tempCity" items="${myCities}">
	
		${tempCity} <br/>
	
	</c:forEach>


</body>
</html>