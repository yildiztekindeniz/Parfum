package deniz.parfum.service;

import deniz.parfum.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();
    public void save(Customer customer);
    public Customer findById(String id);
    public void deleteById(String id);
    public Customer findByName(String name);


}
