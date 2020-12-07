package it.akademija.dao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import it.akademija.model.Product;

@Repository
public class InMemoryProductDao implements ProductDao {

	private final Set<Product> products = new HashSet<>();

	@Override
	public void createProduct(Product product) {
		products.add(product);
	}

	@Override
	public void deleteProduct(String id) {
		for (Product product : products) {
			if (id.equals(product.getId())) {
				products.remove(product);
				break;
			}

		}
	}

	@Override
	public Set<Product> getProducts() {

		return Collections.unmodifiableSet(products);

	}

	@Override
	public Product getProducts(Long id) {

		return products.stream().filter(product -> product.getId() == id).findAny().get();
	}

	@Override
	public void updateProduct(Product product) {
		Product updatedProduct = products.stream().filter(prod -> prod.getId() == product.getId()).findAny().get();
		updatedProduct.setId(product.getId());
		updatedProduct.setDesc(product.getDesc());
		updatedProduct.setImage(product.getImage());
		updatedProduct.setPrice(product.getPrice());
		updatedProduct.setQuantity(product.getQuantity());
		updatedProduct.setTitle(product.getTitle());

	}
}
