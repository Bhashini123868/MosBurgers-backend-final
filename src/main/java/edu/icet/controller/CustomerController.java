package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    private final CustomerService service;
    //  http://localhost:8081/customer

    @PostMapping("/add-customer")
    public Customer addCustomer(@RequestBody Customer customer){
       return service.addCustomer(customer);
    }
    @GetMapping("/get-all-customer")
    public List<Customer> getAll(){
       return service.getAllCustomers();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteCustomer(@PathVariable Integer id){
        return service.deleteCustomer(id);
    }
    @PutMapping("/update-customer")
    public Customer updateCustomer(@RequestBody Customer customer){
       return service.updateCustomer(customer);
    }

    @GetMapping("/searchCustomer/{id}")
    public Optional<Customer> searchCustomerById(@PathVariable Integer id){
       return service.searchCustomerById(id);
    }

    @GetMapping("/searchByName/{name}")
    public List<Customer> searchByName(@PathVariable String name){
       return service.searchByName(name);
    }

    @GetMapping("searchByContact/{contact}")
    public Optional<Customer> searchByContact(@PathVariable String contact){
       return service.searchByContact(contact);
    }
}
