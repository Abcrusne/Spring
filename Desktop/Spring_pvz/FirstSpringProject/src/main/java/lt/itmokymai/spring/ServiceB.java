package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceB {
	private ServiceA serviceA;

//	public ServiceB(ServiceA serviceA) {
//		System.out.println("Inside ServiceB constructor. ");
//		this.serviceA = serviceA;
//	}
	// beans.xml tada (jei su konstruktoriumi:
//
//	 <bean id="serviceBBean" class="lt.itmokymai.spring.ServiceB">
//	 <constructor-arg ref="serviceABean" />
	// o jei per set:
//	 <bean id="serviceBBean" class="lt.itmokymai.spring.ServiceB">
//	 <property name="serviceA" ref="serviceABean" />

	// uzdejus cia Autowired ir serviceA ir ServiceB result yra labas
	@Autowired
	public void setServiceA(ServiceA serviceA) {
		System.out.println("Inside setServiceA. ");
		this.serviceA = serviceA;
	}

	public String getResult() {
		if (serviceA == null) {
			return "service A not found";
		}
		return "ServiceB result:" + serviceA.getMessage();
	}

}
