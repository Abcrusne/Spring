package lt.itmokymai.spring;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Spausdintuvas {

	public Spausdintuvas() {
	}

	public void getProductTitle(List<Product> lists) {
		lists.stream().map(product -> product.getTitle()).forEach(System.out::println);
	}

//	@PostConstruct
//	public void init() {
//		System.out.println("Bean  is going through init.");
//	}
//
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Bean  will destroy now.");
//	}
}
