<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.*,com.luv2code.jsp.tagdemoo.Student"%>


<%

	// Just create some sample data ... normally provided by MVC
	List<Student> data = new ArrayList<>();

	data.add(new Student("John", "Doe", false));
	data.add(new Student("Maxwell", "Johnson", false));
	data.add(new Student("Mary", "Public", true));
	
	pageContext.setAttribute("myStudents", data);

%>

<html>


<body>

<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gold Customer</th>
	
	</tr>

	<c:forEach var="tempStudent" items="${myStudents}">
	
		<!-- call getFirstName() method
			 call getLastName() method
			 call isgoldCustomer() method
			 All the above called behind the scenes is part of JSP built-in Expression Language
		 -->
		 <tr>
			 <td>${tempStudent.firstName}</td>
			 <td>${tempStudent.lastName}</td>
			 <td>${tempStudent.goldCustomer}</td> 
		 </tr>
		
	
	</c:forEach>

</table>



</body>


</html>