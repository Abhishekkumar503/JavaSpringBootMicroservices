package com.learner;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {      
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		System.out.println(username + " : " + password);
		if(username.equals("Abis") && password.equals("Learnings"))
		{
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			response.sendRedirect("welcomeToSite.jsp");
		}	
		else response.sendRedirect("login.jsp");
	}

}
