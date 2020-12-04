package lt.itmokymai.spring;

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
//
		ServiceA a = (ServiceA) context.getBean("serviceA");
		System.out.println(a.getResult());
		a.getMessage();
		context.registerShutdownHook();
//
//		ServiceB b = (ServiceB) context.getBean("serviceB");
//		System.out.println(b.getResult());

//		ServiceA a = (ServiceA) context.getBean("serviceC");
//		System.out.println(a.getResult());
		// Product p = (Product) context.getBean("product");
		ServiceC c = (ServiceC) context.getBean("serviceC");
		c.kvieciuSpausdintuva();
		// c.printBeanList();
//		System.out.println(c.getResult());
		// System.out.println(getTitle(c.getLists()));
		// c.getProductTitle();

	}
}
