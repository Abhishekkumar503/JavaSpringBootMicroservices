package com.security.project.Controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;


@RestController
public class Controller {

	public void redirect(HttpServletResponse response) throws IOException 
	{
		response.sendRedirect("/swagger-ui.html");
	}
}
