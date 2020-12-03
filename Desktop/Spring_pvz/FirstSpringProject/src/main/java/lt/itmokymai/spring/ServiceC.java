package lt.itmokymai.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ServiceC extends ServiceA {

	private String message;

	private List<Products> lists = new ArrayList<Products>();

//	public ServiceC(String message, List<Products> lists) {
//		super();
//		this.message = message;
//		this.lists = lists;
//	}
//
//	public ServiceC() {
//		super();
//	}
//
//	public ServiceC(String message) {
//		super();
//		this.message = message;
//	}
//
//	public ServiceC(List<Products> lists) {
//		super();
//		this.lists = lists;
//	}

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

}
