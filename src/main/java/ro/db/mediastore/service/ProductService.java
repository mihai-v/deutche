package ro.db.mediastore.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.db.mediastore.model.Product;
import ro.db.mediastore.persistance.ProductsDAO;

/**
 *
 * @author mihai
 */
@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductsDAO productDAO;

	public List<Product> getAllProducts() {
		return productDAO.findAllProducts();
	}
}
