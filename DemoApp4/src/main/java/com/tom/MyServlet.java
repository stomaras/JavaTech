package com.tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("Hi <br/>");
		
		ServletConfig cg = getServletConfig();
		
		/* Now the way you can fetch the value of the phone
		 * we need to use a special object
		 *   
		 *   
		*/
		
		// Will give you the value of a parameter which you will specify here
		String str = cg.getInitParameter("name");
		out.println(str);
		
		
		
	}

}
