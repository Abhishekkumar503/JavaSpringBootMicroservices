package com.learner;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display1")
public class JSTLDemo extends HttpServlet {
	String str = "test"; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // JSTL - JSP Standard Tag Library
        String name = "Abhishek";
        Student s = new Student(1, "Abhishek");
        List<Student> stud = Arrays.asList(new Student(1, "Abhishek"), new Student(2, "UDAI"));
        request.setAttribute("students", stud);
        System.out.println(name);
//        request.setAttribute("label", name); // Ensure this line is active
        RequestDispatcher dispatcher = request.getRequestDispatcher("display1.jsp");
        dispatcher.forward(request, response);
    }
}
