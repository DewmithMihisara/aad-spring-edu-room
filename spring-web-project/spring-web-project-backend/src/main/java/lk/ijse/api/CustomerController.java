package lk.ijse.api;

import jakarta.validation.Valid;
import lk.ijse.dto.CustomerDTO;
import lk.ijse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.List;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/customers")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO saveCustomer(@Valid
                                 @RequestPart("id")String id,
                                    @RequestPart("name")String name,
                                    @RequestPart("address")String address,
                                    @RequestPart("profilePic")String profilePic){
        String base64ProfilePic = Base64.getEncoder().encodeToString(profilePic.getBytes());
        CustomerDTO customer = new CustomerDTO(id, name, address, base64ProfilePic);
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("id") String id){
        customerService.deleteCustomer(id);
    }

    @PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("id") String id, @Valid @RequestBody CustomerDTO customer){
        customer.setId(id);
        customerService.updateCustomer(customer);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO GetCustomerDetails(@PathVariable("id") String id){
        return customerService.getCustomerDetails(id);
    }
}

