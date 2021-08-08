<%@ page import="java.net.URLDecoder" %>


<html>


<!-- Create homepage to read cookies and display personalized content -->

<body>

<h3>Training Portal</h3>

<!-- read the favorite programming language cookie -->
<%
	// the default ... if there are no cookies
	String favLang = "Java";

	// get the cookies from the browser request
	Cookie[] theCookies = request.getCookies();
	
	// find our favorite language cookie loop
	if(theCookies != null) {
		
		for(Cookie tempCookie : theCookies) {
			
			if("myApp.favoriteLanguage".equals(tempCookie.getName())){
				favLang = URLDecoder.decode(tempCookie.getValue());
				break;
			}
		}
	}


%>

<!-- now show a personalized page ... use the "favLang" variable -->

<!-- show new books for this lang -->
<!-- ideally we could maybe talk to a database, query a database
	 , get list of books for this given topic but we simply want to focus on cookies
	 right now
 -->
<h4>New Books for <%= favLang %></h4>
<ul>
	<li>blah blah blah</li>
	<li>blah blah blah</li>
</ul>

<h4>Hot Jobs for <%= favLang %></h4>
<ul>
	<li>blah blah blah blah</li>
	<li>blah blah blah blah</li>
</ul>

<a href="cookies-personalize-form.html">Personalize this page</a>

</body>





</html>