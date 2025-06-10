package SpringBoot.Learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
public class HomeController {

  
	@RequestMapping("/r")
	public String home () {
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam ("num1") int firstNum , @RequestParam ("num2") int secondnum , HttpSession session)
	{
		int result = firstNum + secondnum ;
		
		session.setAttribute("result", result);
		return "Result.jsp";
	}

}
