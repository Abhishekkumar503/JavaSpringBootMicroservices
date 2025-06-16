package SpringBoot.Learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import SpringBoot.Learn.model.People;

@Controller
public class PeopleController {

	@Autowired
	PeopleRepo repo;
	
	@ResponseBody
	@GetMapping("people")
	public List<People> getPeople()
	{
		List<People> peopleList = repo.findAll();
		
		return peopleList;
	}
	

	@GetMapping("people/point/{point}")
	@ResponseBody
	public People getOnePeople(@PathVariable("point") int onePoint)
	{
		People ppl =repo.findById(onePoint).orElseThrow(() -> new RuntimeException("Entity not found"));
		return ppl;
	}
	
	@ResponseBody
	@PostMapping("people")
	public String addPeople (People ppl) {
		repo.save(ppl);
		return "People Inserted!!";
	}
	
	@ResponseBody
	@GetMapping("people/name/{oneName}")
	public List<People> getPeopleByName(@PathVariable("oneName") String oneName)
	{
		
		return repo.findByNameOrderByPointsDesc(oneName);
	}
	
	@ResponseBody
	@GetMapping("people/query/{oneName}")
	public List<People> find(@PathVariable("oneName") String oneNameByQuery)
	{
		return repo.findByNameOrderByPointsDesc(oneNameByQuery);
	}
	
	
}
