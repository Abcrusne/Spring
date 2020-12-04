package lt.itmokymai.spring;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {

	private String message = "labas";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
