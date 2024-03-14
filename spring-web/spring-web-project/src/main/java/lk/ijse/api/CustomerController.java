package lk.ijse.api;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-14
 * @since 1.0.0
 */
@RestController
public class CustomerController {
    @GetMapping(value = "/customers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getAllCustomer(){
        ArrayList<CustomerDTO> customerDTOS=new ArrayList<>();

        customerDTOS.add(new CustomerDTO("C001","Dew","Galle"));
        customerDTOS.add(new CustomerDTO("C002","Binadi","Polonnaruwa"));
        customerDTOS.add(new CustomerDTO("C003","Rajapaksha","Madamulana"));

        return customerDTOS;
    }
}
