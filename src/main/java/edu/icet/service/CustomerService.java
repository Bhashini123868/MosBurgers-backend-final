package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Boolean deleteCustomer(Integer id);
    Customer updateCustomer(Customer customer);
    Optional<Customer> searchCustomerById(Integer id);
    List<Customer> searchByName(String name);
    Optional<Customer> searchByContact(String contact);
}
