package com.tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sq")
public class SqServlet extends HttpServlet 
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		HttpSession session = req.getSession();
		
		// cast in order to convert object to int
		int k = (int) session.getAttribute("k");
		
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		
		out.println("sq called");
	}

}
