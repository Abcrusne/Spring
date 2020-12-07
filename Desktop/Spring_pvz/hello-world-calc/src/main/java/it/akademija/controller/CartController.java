package it.akademija.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import it.akademija.dao.CartProductDao;
import it.akademija.model.CartProduct;
import it.akademija.model.CreateCartProductCommand;

@RestController
@Api(value = "cart-products")
@RequestMapping(value = "/api/users/{username}/cart-products")
@ControllerAdvice
public class CartController {

	private final CartProductDao cartProductDao;

	@Autowired
	public CartController(CartProductDao cartProductDao) {
		this.cartProductDao = cartProductDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get user's products in cart", notes = "Returns user's products in cart")
	public Set<CartProduct> getProductsInCart(@PathVariable final String username) {
		return cartProductDao.getCartProducts(username);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Add product to cart", notes = "Add product to a user's cart")
	public void addProductToCart(@PathVariable final String username, @RequestBody final CreateCartProductCommand ccd) {
		cartProductDao.createCartProduct(username, new CartProduct(ccd.getId(), ccd.getQuantity()));
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "Delete product from user's cart", notes = "Delete product from a user's cart")
	public void deleteProductInCart(@PathVariable final String username, @PathVariable final Long id) {
		cartProductDao.deleteCartProduct(username, id);
		System.out.println("Deleting product from cart: " + id);
	}

}
