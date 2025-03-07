package com.learner;



import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int sum = Integer.parseInt(request.getParameter("Num1")) + Integer.parseInt(request.getParameter("Num2")) ;
		System.out.println(sum);
		response.getWriter().println(sum);
	}

}
