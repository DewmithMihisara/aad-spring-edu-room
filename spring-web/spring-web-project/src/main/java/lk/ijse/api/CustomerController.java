package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-14
 * @since 1.0.0
 */
@RestController
public class CustomerController {
    @GetMapping("/customers")
    public String getAllCustomer(){
        return "Hello from CustomerController";
    }
}
