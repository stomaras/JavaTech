package com.tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		
		
		// In this case our servlet will send a response in the browser (client)
		// sendRedirect is a method which belongs to res object and simply says 
		// redirect to sq. Now the issue is you can see in the req object in SqServlet
		// you simply try to fetch the object, of course we are not sending a request object 
		// 
		// Say hey client go to sq and the URL mention k = 12
		res.sendRedirect("sq?k="+k); // URL Rewriting
		
		
		
		// RequestDispatcher
		
		// session management
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	}

}
