package ro.db.mediastore.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ro.db.mediastore.model.Product;

/**
 *
 * @author mihai
 */
@Controller
public class HomeController {
@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "ceva");
		return "welcome";
	}
	@GetMapping("/produse")
	public String productList(Map<String, Object> model) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("assdd",new BigDecimal(33)));
		products.add(new Product("assdfffd",new BigDecimal(353)));
		model.put("productList",products );
		return "productList";
	}
}
