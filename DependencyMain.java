
public class DependencyMain {

	public static void main(String[] args) {
		
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
        
        CustomerService customerService = new CustomerService(customerRepository);

        
        Customer customer = customerService.getCustomerById("123");
        System.out.println(customer);

	}

}
