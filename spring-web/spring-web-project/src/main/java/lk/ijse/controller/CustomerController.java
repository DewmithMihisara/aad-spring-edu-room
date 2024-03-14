package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-14
 * @since 1.0.0
 */
@RestController
@CrossOrigin("*")
public class CustomerController {
    @GetMapping(value = "/customers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getAllCustomer(){
        ArrayList<CustomerDTO> customerDTOS=new ArrayList<>();

        customerDTOS.add(new CustomerDTO("C001","Dew","Galle"));
        customerDTOS.add(new CustomerDTO("C002","Binadi","Polonnaruwa"));
        customerDTOS.add(new CustomerDTO("C003","Rajapaksha","Madamulana"));

        return customerDTOS;
    }

    @PostMapping(value = "/customer/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO);
    }
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable("id") String id){
        System.out.println("delete : "+id);
    }
}
