package lt.itmokymai.spring;

import java.util.ArrayList;
import java.util.List;

public class ServiceC extends ServiceA {
	String result;

	private List<Products> lists = new ArrayList<Products>();

	public String getResult() {
		return "ServiceC result:" + getMessage();
	}

	private String getMessage() {

		return this.result;
	}

	public List<Products> getLists() {
		return lists;
	}

	public void setLists(List<Products> lists) {
		this.lists = lists;
	}

}
