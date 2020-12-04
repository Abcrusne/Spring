package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class ServiceB {
	private ServiceA serviceA;

	@Autowired
	public void setServiceA(ServiceA serviceA) {
		this.serviceA = serviceA;
	}

	public String getResult() {
		if (serviceA == null) {
			return "service A not found";
		}
		return "ServiceB result:" + serviceA.getMessage();
	}

}
