package lt.itmokymai.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	public Product getProduct1() {
		return new Product("1", "stalas", "image", "desc", 23.5, 100);
	}

	@Bean
	public Product getProduct2() {
		return new Product("2", "lempa", "image", "desc", 23.5, 100);
	}

	@Bean
	public Product getProduct3() {
		return new Product("3", "stiklas", "image", "desc", 23.5, 100);
	}

	@Bean
	@Scope(value = "singleton")
	public Spausdintuvas getSpausintuvas1() {
		return new Spausdintuvas();
	}
}
