
public class CustomerService {
	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		// TODO Auto-generated constructor stub
		this.customerRepository = customerRepository;
	}
	  public Customer getCustomerById(String id) {
	        return customerRepository.findCustomerById(id);
	    }

}
