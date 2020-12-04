package lt.itmokymai.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceC extends ServiceA {

	// private String message;
	@Autowired
	private List<Product> lists = new ArrayList<Product>();
	private Spausdintuvas spausdintuvas;

	public void printBeanList() {
		System.out.println(lists);
	}

	public Spausdintuvas getSpausdintuvas() {
		return spausdintuvas;
	}

//	@PostConstruct
//	@PreDestroy
	public void kvieciuSpausdintuva() {
		Spausdintuvas spaus = new Spausdintuvas();
		spaus.getProductTitle(lists);
	}

	public void setSpausdintuvas(Spausdintuvas spausdintuvas) {
		System.out.println("Inside setSpausdintuvas.");
		this.spausdintuvas = spausdintuvas;
	}

	public String getResult() {
		return "ServiceC result:" + getMessage();
	}

	public List<Product> getLists() {
		return lists;
	}

	@Autowired
	public void setLists(List<Product> lists) {
		System.out.println("Inside setLists.");
		this.lists = lists;
	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public String getMessage() {
//
//		return this.message;
//	}

//	public void getProductTitle() {
//		lists.stream().map(product -> product.getTitle()).forEach(System.out::println);
//	}

}
