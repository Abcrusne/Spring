package it.akademija.dao;

import java.util.Set;

import it.akademija.model.Product;

public interface ProductDao {
	Set<Product> getProducts();

	Product getProducts(Long id);

	void createProduct(Product product);

	void deleteProduct(String id);

	void updateProduct(Product product);
}
