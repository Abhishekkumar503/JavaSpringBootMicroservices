package peopleWithSQL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleResource {
	@Autowired
	private PeopleRepo repo;
	
	@GetMapping("/peoplesWithSQL") 
	public List<Peoples> getListPeoples()
	{
		System.out.println("In Resource!");
		List<Peoples> pl = (List<Peoples>) repo.findAll();
		for (Peoples ppl : pl)
		{
			System.out.println(ppl.getPoints()); 
			System.out.println(ppl.getName());
		}
		return pl;
	}
}
