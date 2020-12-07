package it.akademija;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.akademija.model.Product;

@RestController
public class RestService {

	@Autowired(required = false)
	private List<Product> products;

	@RequestMapping("/productsCollection")
	void getProductsCollection() {
		products.stream().map(p -> p.getTitle()).forEach(System.out::println);

	}

}
