package com.learner;
import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/add")
public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest rquest,HttpServletResponse response) throws IOException
	{
		response.getWriter().println("Hi ");
		ServletContext ctx=getServletContext();
		response.getWriter().println(ctx.getInitParameter("Bike"));
	}

// ctx.getInitParameter("name") --> represent as String str =ctx.getInitParameter("name")
// response.getWriter().println("Hi "); --> printWriter out=response.getWriter(); Then out.println("Hi ");
// 

public void doPost(HttpServletRequest rquest,HttpServletResponse response) throws IOException
{
	response.getWriter().println("Hi ");
	ServletConfig cg=getServletConfig();
	response.getWriter().println(cg.getInitParameter("name"));
}
}