package it.akademija;

import java.util.List;

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
@Api(value = "product")
@RequestMapping(value = "/api/products")
@ControllerAdvice
public class ProductController {

	private final ProductDao productDao;

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
			@ApiParam(value = "Product Data", required = true) @Valid @RequestBody final CreateProductCommand cpd) {
		Product product = new Product(cpd.getId(), cpd.getTitle(), cpd.getImage(), cpd.getDesc(), cpd.getPrice(),
				cpd.getQuantity());
		productDao.createProduct(product);
		System.out.println("Created product wit ID: " + cpd.getId());
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteProduct(@PathVariable final String id) {
		productDao.deleteProduct(id);
		System.out.println("Deleting product: " + id);
	}
}
