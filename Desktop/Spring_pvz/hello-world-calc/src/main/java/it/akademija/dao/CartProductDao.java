package it.akademija.dao;

import java.util.Set;

import it.akademija.model.CartProduct;

public interface CartProductDao {

	Set<CartProduct> getCartProducts(String username);

	void createCartProduct(String username, CartProduct cartProduct);

	void deleteCartProduct(String username, Long productId);
}
