package ro.db.mediastore.persistance;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import ro.db.mediastore.model.Product;

/**
 *
 * @author mihai
 */
@Repository
public class ProductsDAO {
	@PersistenceContext
	protected EntityManager em;
	@Autowired private ApplicationContext applicationContext;
	public List<Product> findAllProducts() {
    Query query = em.createQuery("FROM Product e");
    return (List<Product>) query.getResultList();
  }
	public Product getProductById(long id) {
		return em.find(Product.class, id);
}
}
