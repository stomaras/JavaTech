package com.tomy;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		// We send this cookie to the client , this AddServlet will send 
		// the response to the client and client again will send a request 
		// to SqServlet and as the client send the request to SqServlet as well 
		// again will send the cookie as well
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		
		res.sendRedirect("sq"); 

	}

}


