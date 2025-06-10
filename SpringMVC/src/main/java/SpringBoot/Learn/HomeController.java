package SpringBoot.Learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
public class HomeController {

  
	@RequestMapping("/r")
	public String home () {
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(HttpServletRequest request )
	{
		int firstNum = Integer.parseInt(request.getParameter("num1"));
		int secondnum = Integer.parseInt(request.getParameter("num2"));
		int result = firstNum + secondnum ;
		
		HttpSession session = request.getSession();
		session.setAttribute("result", result);
		return "Result.jsp";
	}

}
