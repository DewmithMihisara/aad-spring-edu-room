package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sup")
public class SupplierController {
    @GetMapping
    public String getSuppliers(@RequestParam("id") String id){
        return String.format("id : %s",id);
    }

    @GetMapping("/getag")
    public String getAge(@RequestParam("id") String id, @RequestParam("age") int age){
        return String.format("id : %s  |  age : %s",id,age);
    }
}
