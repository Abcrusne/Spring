package it.akademija;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.validation.Valid;

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
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "user")
@RequestMapping(value = "/api/users")
@ControllerAdvice
public class ProductController {

	@Autowired
	private final ProductDao productDao;
	private final List<Product> products = new CopyOnWriteArrayList<>();

	@Autowired
	public ProductController(ProductDao productDao) {
		this.productDao = productDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get products", notes = "Returns registered products")
	public List<Product> getProducts() {
		return productDao.getProducts();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Create product", notes = "Creates products with data")
	public void createProduct(
			@ApiParam(value = "User Data", required = true) @Valid @RequestBody final CreateProductCommand cpd) {

		// productDao.createProduct(cpd);
		System.out.println("Created product wit ID: " + cpd.getId());
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable final String id) {
		productDao.deleteProduct(id);
		System.out.println("Deleting product: " + id);
	}
}
