package ro.db.mediastore.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mihai
 */
@Entity
@Table(name = "Products")
public class Product {
	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ID;
	@Column(name = "NAME",nullable=false)
	private String name;
	private BigDecimal price;
	public Product() {}
	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price; 
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product{" + "name=" + name + ", price=" + price + '}';
	}
	
		
}
