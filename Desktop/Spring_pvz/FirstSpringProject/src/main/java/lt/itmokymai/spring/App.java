package lt.itmokymai.spring;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		var factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		var pasaulis = (HelloWorld) factory.getBean("helloWorld");
//		System.out.println((pasaulis.getMessage()));
// System.out.println( "Hello World!" );

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		ServiceA obj = (ServiceA) context.getBean("serviceABean");
		obj.getResult();
		obj.getMessage();
		context.registerShutdownHook();

		ServiceB b = (ServiceB) context.getBean("serviceBBean");
		System.out.println(b.getResult());

//		ServiceA a = (ServiceA) context.getBean("serviceCBean");
//		System.out.println(a.getResult());
		ServiceC c = (ServiceC) context.getBean("serviceCBean");
		System.out.println(c.getResult());
		System.out.println(getTitle(c.getLists()));

	}

	public static List<String> getTitle(List<Products> lists) {
		return lists.stream().map(product -> product.getTitle()).collect(Collectors.toList());
	}
}
