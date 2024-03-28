package lk.ijse.service.impl;

import lk.ijse.dto.CustomerDTO;
import lk.ijse.entity.Customer;
import lk.ijse.repositories.CustomerRepository;
import lk.ijse.service.CustomerService;
import lk.ijse.service.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    Transformer transformer;

    @Autowired
    CustomerRepository customerRepo;
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll().stream()
                .map(customer -> transformer.fromCustomerEntity(customer)).toList();
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return transformer.fromCustomerEntity(customerRepo.findById(id).get());
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        customerRepo.save(transformer.toCustomerEntity(customerDTO));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        customerRepo.save(transformer.toCustomerEntity(customerDTO));
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);
    }
}
