package SpringBoot.Learn;

import java.net.Authenticator.RequestorType;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import SpringBoot.Learn.model.People;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
public class HomeController {

	@ModelAttribute
	public void name(Model m)
	{
		m.addAttribute("name","Abhishek");
	}
  
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
	
//	@RequestMapping("addPeople")
//	public String addPeople (@RequestParam ("points") int points , @RequestParam ("name") String name , Model m) {
//		
//		People ppl = new People();
//		ppl.setPoints(points);
//		ppl.setName(name);
//		
//		m.addAttribute("people",ppl);
//		
//		return "Result";
//		
//	}
	
	
	// EX 1
//	@RequestMapping("addPeople")
//	public String addPeople (@ModelAttribute People ppl, Model m) {
//		
//
//		m.addAttribute("people",ppl);
//		
//		return "Result";
//		
//	}
	
	//Ex : 2
//	@RequestMapping("addPeople")
//	public String addPeople (@ModelAttribute("people") People ppl) {
//		
//
//		return "Result";
//		
//	}
	
	//Ex : 3
//	@RequestMapping("addPeople")
//	public String addPeople (People ppl) {
//				return "Result";
//	}
	
	//Ex : 4
//		@RequestMapping(value="addPeople", method = RequestMethod.POST)
//		public String addPeople1 (@ModelAttribute People ppl) {
//					return "Result";
//		}

	@PostMapping("addPeople")
	public String addPeople1 (@ModelAttribute People ppl) {
		return "Result";
	}
	
	@GetMapping("addPeople")
	public String getPeople(Model m)
	{
		List<People> list = Arrays.asList(new People(101,"Abhishek"),new People(102,"udai"));
		m.addAttribute("People",list);
		return "showPeople";
	}
	
	
	
	

}
