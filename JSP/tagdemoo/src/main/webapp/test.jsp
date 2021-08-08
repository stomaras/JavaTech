<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- prefix c simply short for core so we are gonna make use of the 
	 core tag library here.
 -->
 
<html>


<body>
<!-- we make use of jstl core tag library to set a variable , and then 
	 we simply displayed it.
 -->
<c:set var="stuff" value= "<%= new java.util.Date() %>" />

Time on the server is ${stuff}


</body>


</html>