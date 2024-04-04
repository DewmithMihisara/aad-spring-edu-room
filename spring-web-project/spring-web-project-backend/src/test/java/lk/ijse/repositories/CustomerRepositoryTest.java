package lk.ijse.repositories;

import jakarta.transaction.Transactional;
import lk.ijse.config.WebRootConfig;
import lk.ijse.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-04
 * @since
 */
@SpringJUnitConfig(classes = WebRootConfig.class)
@Transactional
@WebAppConfiguration
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    void addCustomers(){
        customerRepository.save(new Customer("C001", "Dewmith", "Colombo", "acacacascxsa"));
        customerRepository.save(new Customer("C002", "kasun", "galle", "acacacascxsa"));
        customerRepository.save(new Customer("C003", "nimal", "Colombo", "acacacascxsa"));
    }

    @Test
    void saveCustomer(){
        customerRepository.save(new Customer("C001", "Dewmith", "Colombo", "acacacascxsa"));
        assertNotNull(customerRepository.findById("C001"));
    }
    @Test
    void findCustomersByName(){
        addCustomers();
        List<Customer>customerList = customerRepository.findCustomersByName("Dewmith");
        for (Customer customer : customerList) {
            System.out.println(customer.getName());
        }
    }
    @Test
    void searchByNameAndAddress(){
        addCustomers();
        Customer customer = customerRepository.searchByNameAndAddress("Dewmith", "Colombo");
        System.out.println(customer.getName());

    }
    @Test
    void countCustomersByAddressStartingWith(){
        addCustomers();
        int count = customerRepository.countCustomersByAddressStartingWith("Col");
        System.out.println(count);
    }
    @Test
    void getAllCustomers(){
        addCustomers();
        List<Customer> allCustomers = customerRepository.getAllCustomers();
        allCustomers.forEach(System.out::println);
    }
    @Test
    void getAllCustomerWithJPQL(){
        addCustomers();
        List<Customer> allCustomers = customerRepository.getAllCustomerWithJPQL();
        allCustomers.forEach(System.out::println);
    }
    @Test
    void getCustomerWithHQL(){
        addCustomers();
        List<Customer> allCustomers = customerRepository.getCustomerWithHQL();
        allCustomers.forEach(System.out::println);
    }
}