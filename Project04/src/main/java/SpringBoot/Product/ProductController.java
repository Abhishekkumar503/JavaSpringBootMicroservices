package SpringBoot.Product;


import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@ResponseBody
	@PostMapping(path = "product" ,  consumes = {"application/json"})
	public void saveProducts(@RequestBody Product product)
	{
		service.addProduct(product);
	}
	
	@ResponseBody
	@GetMapping("products/name/{one}")
	public List<Product> getOneProdctbyName(@PathVariable("one") String name)
	{
		return service.getProdcutByName(name);
	}
	
	@ResponseBody
	@GetMapping("products/type/{one}")
	public List<Product> getOneProdctbyType(@PathVariable("one") String type)
	{
		return service.getProdcutByType(type);
	}
	
	@ResponseBody
	@GetMapping("products/place/{one}")
	public List<Product> getOneProdctbyPlace(@PathVariable("one") String place)
	{
		return service.getProdcutByPlace(place);
	}
	
	@ResponseBody
	@GetMapping("products/text/{one}")
	public List<Product> getOneProdctbyText(@PathVariable("one") String text)
	{
		return service.getProdcutByText(text);
	}
	
	@ResponseBody
	@GetMapping("products/warrenty/{one}")
	public List<Product> getOneProdctbyWarrenty(@PathVariable("one") String warrenty)
	{
		return service.getProductByWarnty(warrenty);
	}
	
	@ResponseBody
	@GetMapping("products/id/{one}")
	public Product getOneProdctbyWarrenty(@PathVariable("one") int id)
	{
		return service.getProductByID(id);
	}
	
	

}
