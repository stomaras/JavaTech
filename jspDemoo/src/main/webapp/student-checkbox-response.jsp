<html>

<head><title>Student Confirmation Title</title></head>

<body>

	The student is confirmed: ${param.firstName} ${param.lastName}

	<br/><br/>
	
	
	Favorite Programming Languages: <br/>
	
	<!-- display list of "favoriteLanguage" -->
	<!-- JSP Scriplet generator of code in JSP page -->
	<ul>
		<%
			String[] langs = request.getParameterValues("favoriteLanguage");
		
			if(langs != null){
				for (String tempLang : langs) {
					out.println("<li>" + tempLang + "</li>");
				}
			} else {
					out.println("Please check 1 programming Language");
			}

		 %>
	</ul>
</body>
</html>