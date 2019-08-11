package deniz.parfum.service;


import deniz.parfum.entity.Customer;
import deniz.parfum.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;

@Component
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){

        this.customerRepository=customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        List<Customer> customers=customerRepository.findAll();
        return customers;
    }


    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(String id) {
        Optional<Customer> result=customerRepository.findById(id);
        Customer customer =null;

        if(result.isPresent()){
            customer=result.get();
        }
        else{
            throw new RuntimeException("Customer id not found " +id);

        }

        return customer;

    }


}
