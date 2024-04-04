package lk.ijse.repositories;

import jakarta.transaction.Transactional;
import lk.ijse.config.WebRootConfig;
import lk.ijse.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;

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

    @Test
    void saveCustomer(){
        customerRepository.save(new Customer("C001", "Dewmith", "Colombo", "acacacascxsa"));
        assertNotNull(customerRepository.findById("C001"));
    }
}