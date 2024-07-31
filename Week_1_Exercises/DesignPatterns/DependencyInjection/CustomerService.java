public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor for dependency injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomer(String id) {
        return customerRepository.findCustomerById(id);
    }
}
