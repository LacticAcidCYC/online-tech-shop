package onlineShop.service;

import java.util.List;

import onlineShop.model.Product;

public interface ProductService {
	
	void addProduct(Product product);
	
	void deleteProduct(int productId);
	
	void updateProduct(Product product);
	
	Product getProductById(int productId);
	
	List<Product> getAllProducts();
}
