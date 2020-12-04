package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceB {
	private ServiceA serviceA;
	private String message = "service b mesg";

	@Autowired
	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public ServiceA getServiceA() {
		return serviceA;
	}

	public String getMessage() {
		if (serviceA == null) {
			return message;
		}
		return "ServiceB result:" + serviceA.getMessage();
	}

	public void setMesssage(String mes) {
		this.message = mes;
	}

}
