package ro.db.mediastore.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
