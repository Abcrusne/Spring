package lt.itmokymai.spring;

public class ServiceB {
	private ServiceA serviceA;

	public ServiceB(ServiceA serviceA) {
		System.out.println("Inside ServiceB constructor. ");
		this.serviceA = serviceA;
	}
	// beans.xml tada (jei su konstruktoriumi:
//
//	 <bean id="serviceBBean" class="lt.itmokymai.spring.ServiceB">
//	 <constructor-arg ref="serviceABean" />
	// o jei per set:
//	 <bean id="serviceBBean" class="lt.itmokymai.spring.ServiceB">
//	 <property name="serviceA" ref="serviceABean" />

	public void setServiceA(ServiceA serviceA) {
		System.out.println("Inside setServiceA. ");
		this.serviceA = serviceA;
	}

	public String getResult() {

		return "ServiceB result:" + serviceA.getMessage();
	}

}
