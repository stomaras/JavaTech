<html>

<body>'






<h3>JSP Built-In Object</h3>

<!-- This will tell you the actual browser that the client is using.
	 Also will tell the operating system which is running on.

-->
Request user agent: <%= request.getHeader("User-Agent") %>



<br/><br/>

<!-- Language which we use -->
Request Language: <%= request.getLocale() %>





</body>




</html>