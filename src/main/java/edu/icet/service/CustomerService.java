package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Boolean deleteCustomer(Integer id);
    Customer updateCustomer(Customer customer);
    Customer searchCustomerById(Integer id);
    List<Customer> searchByName(String name);
    Customer searchByContact(String contact);
}
