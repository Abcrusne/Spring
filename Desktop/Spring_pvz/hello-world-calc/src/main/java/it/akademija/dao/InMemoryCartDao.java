package it.akademija.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import it.akademija.model.CartProduct;

@Repository
public class InMemoryCartDao implements CartProductDao {

	private final Map<String, Set<CartProduct>> carts = new HashMap<>();

	@Override
	public Set<CartProduct> getCartProducts(String username) {

		return carts.get(username);
	}

	@Override
	public void createCartProduct(@PathVariable final String username, CartProduct cartProduct) {
		if (!carts.containsKey(username)) {
			carts.put(username, new HashSet<>());
		}
		carts.get(username).add(cartProduct);

	}

	@Override
	public void deleteCartProduct(@PathVariable final String username, Long productId) {
		carts.get(username).removeIf(product -> product.getId() == productId);

	}

}
