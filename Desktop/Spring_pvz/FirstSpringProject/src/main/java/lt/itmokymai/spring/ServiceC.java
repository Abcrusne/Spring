package lt.itmokymai.spring;

import java.util.ArrayList;
import java.util.List;

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

	public void setLists(List<Products> lists) {
		this.lists = lists;
	}

	public void getProductTitle() {
		for (Products product : lists) {
			System.out.println(product.getTitle());
		}
	}

}
