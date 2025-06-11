package SpringBoot.Learn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
public class HomeController {

  
	@RequestMapping("/r")
	public String home () {
		return "index";
	}
	
//	@RequestMapping("add")
//	public String add(@RequestParam ("num1") int firstNum , @RequestParam ("num2") int secondnum , HttpSession session)
//	{
//		int result = firstNum + secondnum ;
//		
//		session.setAttribute("result", result);
//		return "Result.jsp";
//	}
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam ("num1") int firstNum , @RequestParam ("num2") int secondnum )
//	{
//		ModelAndView mv = new ModelAndView(); // Model attribute
//		mv.setViewName("Result.jsp"); // to set the view name LIKE next page
//		int result = firstNum + secondnum ;
//		
//		mv.addObject("result", result); // adding both obj and value
//		return mv;
//	
//	}
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam ("num1") int firstNum , @RequestParam ("num2") int secondnum )
//	{
//		ModelAndView mv = new ModelAndView(); // Model attribute
//		mv.setViewName("Result"); // to set the view name LIKE next page
//		int result = firstNum + secondnum ;
//		
//		mv.addObject("result", result); // adding both obj and value
//		return mv;
//	
//	}
	
	
	@RequestMapping("add")
	public String add(@RequestParam ("num1") int firstNum , @RequestParam ("num2") int secondnum , ModelMap mv)
	{
		int result = firstNum + secondnum ;
		
		mv.addAttribute("result", result); // adding both obj and value
		return "Result";
	
	}
	
	

}
