package com.learner;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JSTLDemo extends HttpServlet{
	protected void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException ,IOException
	{
		// JSTL- JSP Standard tag library
		String name = "Abhishek";
		request.setAttribute("label", "Abhishek");
		RequestDispatcher dispatcher = request.getRequestDispatcher("Display.jsp");
		dispatcher.forward(request, response);

	}

}
