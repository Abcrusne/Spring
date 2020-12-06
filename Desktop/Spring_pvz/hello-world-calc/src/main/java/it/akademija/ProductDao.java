package it.akademija;

import java.util.List;

public interface ProductDao {

	List<Product> getProducts();

	void createProduct(Product product);

	void deleteProduct(String id);
}
