package ro.db.mediastore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.put("message", "Bine ai venit in magazin.");
		return "welcome";
	}

	@GetMapping("/products")
	public String productList(Map<String, Object> model) {

		List<Product> products = ps.getAllProducts();
		model.put("productList", products);
		return "productList";
	}

	@PostMapping("/addProductToCart")
	public String testMestod(HttpSession session, Map<String, Object> model, long productId) {
		if (session.getAttribute("cart") == null) {
			session.setAttribute("cart", new ArrayList<>());
		}
		List<Product> prod = (List<Product>) session.getAttribute("cart");

		prod.add(ps.getProduct((productId)));

		return "redirect:/products";
	}
}
