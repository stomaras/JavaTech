<html>

<body>


<h3>
JSP Built-In Objects
</h3>

/* Tell us the browser which JSP running on */
Request user agent: <%= request.getHeader("User-Agent") %>

<br/><br/>
Request language: <%= request.getLocale() %>

</body>
</html>