package ro.db.mediastore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
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
		model.put("message", "ceva");
		return "welcome";
	}
	@GetMapping("/produse")
	public String productList(Map<String, Object> model) {
		
		List<Product> products = ps.getAllProducts();
		model.put("productList",products );
		return "productList";
	}
	@PostMapping("/cart-post")
	public String testMestod(HttpServletRequest request, long productId, Map<String, Object> model){ 
		
				if( request.getSession(true).getAttribute("cart") == null) {
					request.getSession().setAttribute("cart", new ArrayList<Product>());
				}
				List<Product> prod =(List<Product>) request.getSession().getAttribute("cart");
				
				prod.add(ps.getProduct((productId)));
				
				request.getSession().setAttribute("cart", prod);
				
     List<Product> products = ps.getAllProducts();
		model.put("productList",products );
		return "productList";
  }
}
