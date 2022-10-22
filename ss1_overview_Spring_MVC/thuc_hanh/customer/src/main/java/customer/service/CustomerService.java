package customer.service;

import customer.models.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    void save(Customer student);

    public List<Customer> findByName(String keyword);
}
