import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mjrousos.model.Customer;
import com.mjrousos.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		Customer firstCustomer = service.findAll().get(0);
		
		StringBuilder buffer = new StringBuilder("Hello ");
		buffer.append(firstCustomer.getFirstname());
		buffer.append(" ");
		buffer.append(firstCustomer.getLastname());
				
		System.out.println(buffer.toString());
		
		System.out.println("Service hash/address: " + service.toString());
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println("Service2 hash/address: " + service2.toString());
	}

}
