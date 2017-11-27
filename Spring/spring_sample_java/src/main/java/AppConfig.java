import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.mjrousos.repository.CustomerRepository;
import com.mjrousos.repository.HibernateCustomerRepositoryImpl;
import com.mjrousos.service.CustomerService;
import com.mjrousos.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.mjrousos"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		// Autowired
		CustomerServiceImpl service = new CustomerServiceImpl();
		
		
		// Ctor injection
		// CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		
		// Setter injection
		// CustomerServiceImpl service = new CustomerServiceImpl();
		// service.setCustomerRepository(getCustomerRepository());
		
		return service;
	}
	
// This bean can be defined here or via an annotation (@Repository) on the repository
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
	
}
