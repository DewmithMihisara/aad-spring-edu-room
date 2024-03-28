package lk.ijse.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.dto.CustomerDTO;
import lk.ijse.entity.Customer;
import lk.ijse.repositories.CustomerRepository;
import lk.ijse.service.CustomerService;
import lk.ijse.service.exception.NotFoundException;
import lk.ijse.service.util.Transformer;
import lk.ijse.service.util.UtilMatter;
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
@Transactional
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
        if (!customerRepo.existsById(id))
            throw new NotFoundException("No customer for ID: " + id);
        return transformer.fromCustomerEntity(customerRepo.findById(id).get());
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setId(UtilMatter.generateID());
        return transformer.fromCustomerEntity(customerRepo.save(transformer.toCustomerEntity(customerDTO)));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (!customerRepo.existsById(customerDTO.getId()))
            throw new NotFoundException("No customer for ID: " + customerDTO.getId());
        customerRepo.save(transformer.toCustomerEntity(customerDTO));
    }

    @Override
    public void deleteCustomer(String id) {
        if (!customerRepo.existsById(id))
            throw new NotFoundException("No customer for ID: " + id);
        customerRepo.deleteById(id);
    }
}
