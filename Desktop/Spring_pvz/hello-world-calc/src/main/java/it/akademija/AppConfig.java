package it.akademija;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:application-context.xml" })
@Configuration
public class AppConfig {

//	@Bean
//	public Product getProduct1() {
//		return new Product(1, "stalas", "image", "desc", 23.5, 100);
//	}
//
//	@Bean
//	public Product getProduct2() {
//		return new Product(1, "lempa", "image", "desc", 34.7, 100);
//	}
//
//	@Bean
//	public Product getProduct3() {
//		return new Product(1, "stiklas", "image", "desc", 50.5, 100);
//	}

//	@Bean
//	@Scope(value = "singleton")
//	public Spausdintuvas getSpausintuvas1() {
//		return new Spausdintuvas();
//	}
}

//    @Autowired
//    DataSourceProperties dataSourceProperties;
//
//    @Bean
//    @ConfigurationProperties(prefix = DataSourceProperties.PREFIX)
//    DataSource realDataSource() {
//        DataSource dataSource = DataSourceBuilder
//                .create(this.dataSourceProperties.getClassLoader())
//                .url(this.dataSourceProperties.getUrl())
//                .username(this.dataSourceProperties.getUsername())
//                .password(this.dataSourceProperties.getPassword())
//                .build();
//        return dataSource;
//    }
//
//    @Bean
//    @Primary
//    DataSource dataSource() {
//        return new DataSourceSpy(realDataSource());
//    }
