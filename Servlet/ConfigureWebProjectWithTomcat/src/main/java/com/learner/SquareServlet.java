package com.learner;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Square")
public class SquareServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int num = (int)request.getAttribute("Square");
		num *= num;
		System.out.println(num);
		response.getWriter().print("Square is : "+ num );
	}
	
	
	// Change by Url Method
//	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
//		int num = Integer.parseInt(request.getParameter("num")); //num is Param which comes form AddServlet both should remain same otherwise return null exception
//		num *= num;
//		System.out.println(num);
//		response.getWriter().print("Square is : "+ num );
//	}
	
	
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		// by providing values in session
		
//		HttpSession session = request.getSession();
//		int num = (int)session.getAttribute("num");
		
		
		// By Cookies
		int num = 0;
		Cookie[] cookies = request.getCookies();
		for( Cookie c : cookies )
		{
			if(c.getName().equals("num"))
				num = Integer.parseInt(c.getValue());
		}
		num *= num;
		System.out.println(num);
		response.getWriter().print("Square is : "+ num );
	
	}
}
