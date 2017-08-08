package ro.db.mediastore.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ro.db.mediastore.model.Product;
import ro.db.mediastore.service.ProductService;

/**
 *
 * @author mihai
 */
@Controller
public class HomeController {
	@Autowired
	private ProductService ps;
@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "ceva");
		return "welcome";
	}
	@GetMapping("/produse")
	public String productList(Map<String, Object> model) {
		
		List<Product> products = ps.getAllProducts();
		model.put("productList",products );
		return "productList";
	}
}
