package crudOperation.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import crudOperation.Model.Product;
import jakarta.transaction.Transactional;

@Component
public class productcrud {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void createProduct(Product product) {
		
		this.hibernatetemplate.save(product);
	}
	
	//get all products
	public List<Product> getproduct(){
		List<Product> products = this.hibernatetemplate.loadAll(Product.class);
		return products;
	}
	//delete a single record
	@Transactional
	public void deleteproduct(int pId) {
		Product p = this.hibernatetemplate.load(Product.class, pId);
		this.hibernatetemplate.delete(p);
	}
	//get the single product
	public Product getproduct(int pId) {
		return this.hibernatetemplate.get(Product.class, pId);
	}
}
