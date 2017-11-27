import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mjrousos.model.Customer;
import com.mjrousos.service.CustomerService;
import com.mjrousos.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		Customer firstCustomer = service.findAll().get(0);

		StringBuilder buffer = new StringBuilder("Hello ");
		buffer.append(firstCustomer.getFirstname());
		buffer.append(" ");
		buffer.append(firstCustomer.getLastname());

		System.out.println(buffer.toString());
	}

}
