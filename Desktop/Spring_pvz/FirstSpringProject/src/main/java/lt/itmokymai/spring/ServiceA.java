package lt.itmokymai.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {

	private String message = "labas";

	public String getResult() {
		return "ServiceA result: " + getMessage();
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean  is going through init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean  will destroy now.");
	}

//	public void close() {
//		System.out.println("Closing All Resources");
//	}

}
