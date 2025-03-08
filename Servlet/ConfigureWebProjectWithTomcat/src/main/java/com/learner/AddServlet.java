package com.learner;



import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int sum = Integer.parseInt(request.getParameter("Num1")) + Integer.parseInt(request.getParameter("Num2")) ;
		System.out.println(sum);
		response.getWriter().print("Sum is : "+ sum );
		
		request.setAttribute("Square", sum);
		RequestDispatcher rd = request.getRequestDispatcher("Square");
		rd.forward(request, response);
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int sum = Integer.parseInt(request.getParameter("Num1")) - Integer.parseInt(request.getParameter("Num2")) ;
		System.out.println(sum);
		response.getWriter().print("Subtract is : "+ sum );
		
//		response.sendRedirect("Square?num=" + sum); // used for second (by sendredirect)
		
//		HttpSession session = request.getSession(); //By http session
//		session.setAttribute("num", sum);
		
		Cookie cookie=new Cookie("num",sum+""); // by Cookies
		response.addCookie(cookie);
		
		response.sendRedirect("Square");
	}
	
}
