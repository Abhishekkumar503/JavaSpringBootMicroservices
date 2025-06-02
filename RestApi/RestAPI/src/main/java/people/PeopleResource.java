package people;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleResource {
	@GetMapping("/peoples") 
	public List<Peoples> getListPeoples()
	{
		List<Peoples> ppl = new ArrayList<>();
		System.out.println("In Resource!");
		
		Peoples p1 = new Peoples();
		p1.setPoints(100);
		p1.setName("Abhishek");
		
		Peoples p2 = new Peoples();
		p2.setPoints(101);
		p2.setName("Udai");
		
		ppl.add(p1);
		ppl.add(p2);
		
		return ppl;
	}
}
