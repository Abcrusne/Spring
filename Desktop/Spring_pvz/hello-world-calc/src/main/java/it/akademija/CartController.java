package it.akademija;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "cart")
@RequestMapping(value = "/api/cart")
@ControllerAdvice
public class CartController {
	private final ProductDao productDao;

	@Autowired
	public CartController(ProductDao productDao) {
		this.productDao = productDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get products in cart", notes = "Returns products in cart")
	public List<Product> getProductsInCart() {
		return productDao.getProducts();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteProductInCart(@PathVariable final String id) {
		productDao.deleteProduct(id);
		System.out.println("Deleting product from cart: " + id);
	}

}
