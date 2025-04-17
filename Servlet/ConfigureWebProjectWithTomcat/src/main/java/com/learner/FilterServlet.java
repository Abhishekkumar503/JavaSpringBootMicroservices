package com.learner;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FilterServlet")
public class FilterServlet  extends HttpServlet{
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		out.print("Welcome " + name);
	}

}
