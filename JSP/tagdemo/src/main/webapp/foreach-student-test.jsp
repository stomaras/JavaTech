<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*" %>
<%@ page import="com.luv2code.jsp.tagdemo.Student" %>

<%

	// just create some sample data ... normally provided by MVC
	List<Student> data = new ArrayList<>();

	data.add(new Student("Chris", "Fragulis", false));
	data.add(new Student("Spyros", "Tom", false));
	data.add(new Student("Kostas", "Fragulis", true));
	
	pageContext.setAttribute("myStudents", data);

%>

<html>

<body>

	<table border = "1">
	
	<tr>
		<th></th>
		<th></th>
		<th></th>
	</tr>
	
	<c:forEach var="tempStudent" items="${myStudents}">
	
		<tr>
			<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>${tempStudent.goldCustomer}</td>
		</tr>
		
	</c:forEach>
	
	</table>

</body>


</html>