package lk.ijse.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.config.JPAConfig;
import lk.ijse.config.WebAppConfig;
import lk.ijse.config.WebRootConfig;
import lk.ijse.dto.CustomerDTO;
import lk.ijse.service.CustomerService;
import lk.ijse.service.exception.NotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-04
 * @since 1.0.0
 */
@SpringJUnitConfig(classes = WebRootConfig.class)
@Transactional
@WebAppConfiguration
class CustomerServiceImplTest {

    CustomerDTO addCustomer(){
        CustomerDTO customerDTO = new CustomerDTO("C001", "Dewmith", "Colombo", "acacacascxsa");
        return cus.saveCustomer(customerDTO);
    }

    @Autowired
    CustomerService cus;

    @Test
    void getAllCustomers() {
        assertDoesNotThrow(() -> {
            cus.getAllCustomers();
        });
    }

    @Test
    void getCustomerDetails() {
        assertThrows(NotFoundException.class, () -> {
            cus.getCustomerDetails("C002");
        });

        CustomerDTO customer = addCustomer();

        assertDoesNotThrow(() -> {
            cus.getCustomerDetails(customer.getId());
        });


    }

    @Test
    void saveCustomer() {
        CustomerDTO customer = addCustomer();
        assertNotEquals(null, customer);
    }

    @Test
    void updateCustomer() {
        CustomerDTO customerDTO = addCustomer();
        customerDTO.setName("Dewmith Mihisara");
        cus.updateCustomer(customerDTO);
        assertEquals("Dewmith Mihisara", cus.getCustomerDetails(customerDTO.getId()).getName());
    }

    @Test
    void deleteCustomer() {
        CustomerDTO customer = addCustomer();
        cus.deleteCustomer(customer.getId());
        assertThrows(NotFoundException.class, () -> {
            cus.getCustomerDetails(customer.getId());
        });
    }
}