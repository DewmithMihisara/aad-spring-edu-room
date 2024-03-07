package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cus")
public class CustomerController {
    @GetMapping
    public String getCus(){
        return "gat cus";
    }

}
