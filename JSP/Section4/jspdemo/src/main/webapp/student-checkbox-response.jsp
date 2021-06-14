<html>

<head>
<title>
Student Confirmation Title
</title>

</head>

<body>

The student is confirmed: <%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %>

<br /><br />

<% String[] langs = request.getParameterValues("favoriteLanguage"); %>

The student's favorite programming languages: 

<ul>
	<%
		if(langs != null) {
			for (String tempLang: langs) {
				out.println("<li>" + tempLang + "</li>");
			}
		}
	%>
</ul>



</body>
</html>