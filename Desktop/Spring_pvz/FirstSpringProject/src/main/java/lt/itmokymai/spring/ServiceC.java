package lt.itmokymai.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceC extends ServiceA {

	private String message;

	private List<Products> lists = new ArrayList<Products>();

	public String getResult() {
		return "ServiceC result:" + getMessage();
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {

		return this.message;
	}

	public List<Products> getLists() {
		return lists;
	}

	@Autowired
	public void setLists(List<Products> lists) {
		this.lists = lists;
	}

	public void getProductTitle() {
		lists.stream().map(product -> product.getTitle()).forEach(System.out::println);
//		for (Products product : lists) {
//			System.out.println(product.getTitle());
//
//		}
	}

}
