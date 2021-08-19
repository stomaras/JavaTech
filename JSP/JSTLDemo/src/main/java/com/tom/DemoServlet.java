package com.tom;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// JSTL -> JSP Standard Tag Library
		/*
		 * We are sending data in the JSP in the object format
		 * in order to print the entire object in the jsp page you have to make sure,
		 * that you have implement the toString() method inside the Student.java code.
		 */
		List<Student> studs = Arrays.asList(new Student(1,"Navin"),new Student(2,"Tom"));
		
		request.setAttribute("students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

	

}
