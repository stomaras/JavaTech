<%@ page import="java.util.*" %>
<html>

<body>


<!-- Step 1: Create HTML form -->
<form action="todo-demo.jsp">
	Add new item: <input type="text" name="theItem" />
	
	<input type="submit" value="Submit" />
</form>

<br>
Item entered: <%= request.getParameter("theItem") %>

<!-- Step 2: Add new item to "To Do" list -->
<%
	// get the TO DO items from the session
	List<String> items = (List<String>) session.getAttribute("myToDoList");
	
	// if the TO DO items doesn't exist, then create a new one
	if(items == null){
		items = new ArrayList<String>();
		session.setAttribute("myToDoList", items);
	}
	
	// see if there is form data to add
	String theItem = request.getParameter("theItem");
	
	//
	// UPDATED CODE BLOCK FOR booleans and if/then statement
	// 
	boolean isItemNotEmpty = theItem != null && theItem.trim().length() > 0;
	boolean isItemNotDuplicate = theItem != null && !items.contains(theItem.trim());
	if(isItemNotEmpty && isItemNotDuplicate) {
		items.add(theItem.trim());
	}

%>
<!-- Step 3: Display all "To Do" item from session -->
<hr>
<b>To List Items: </b> </br>

<ol>
<%
	for (String temp : items) {
		out.println("<li>" + temp + "</li>");
	}
%>
</ol>


</body>


<%
/*
	PageContext
	
	>> Please define clearly what pageContext is and what it does.
	
	A PageContext instance provides access to all the namespaces associated with a JSP page, provides access to several page attributes,
	as well as a layer above the implementation details. Implicit objects are added to the pageContext automatically.
	
	The PageContext provides a number of facilities to the developer, including:
		
		- a single API to manage the various scoped namespaces
		- a number of convenience API's to access various public objects
		- a mechanism to obtain the JspWriter for output
		- a mechanism to manage session usage by the page
		- a mechanism to expose page directive attributes to the scripting environment
		- mechanisms to forward or include the current request to other active components in the application
		- a mechanism to handle errorpage exception processing
		
	>> And how is pageContext.setAttribute("name", value) different from session.setAttribute("name", value).
		
	PageContext has a set of attributes that are different from the Session object.
	The attributes set on PageContext are only available for a given page. The attributes are not available to other pages or servlets in the application.
	Session attributes are created per each user's session.
	The session attributes are unique to a given session id.
	Session attributes are available to other pages and servlets in the application for a given session id.

	>> Please also include how it's instantiated and where it comes from besides its purpose.
	
	The PageContext is implicitly instantiated by the application server.

	The JSP page will always have access to the PageContext.
	
	Question

	When does the object we store in the session get updated? How does it work behind the scenes?
			
			Answer

			When you use the statement:

			List<String> items = (List<String>) session.getAttribute("myToDoList");  

			The "items" variable is pointing to the SAME object in the session. You don't get a local copy. You are pointing to the same object.

			Any changes to the "items" variable such as calling "items.add(...)" performs the update on the session object since we are pointing to the same object.

			As a result, there is no need to explicitly update the session object.

			You are not required to use the code below

			session.setAttribute("myToDoList", items);  

			---

			The key here is that we are pointing to the same object in the session.	


*/


%>

</html>