package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cus")
public class CustomerController {

    @GetMapping
    public String getCus(){
        return "gat cus";
    }


    @GetMapping("/{city}")
    public String getCusCity(@PathVariable("city") String city){
        return String.format("getCus(String city):%s",city);
    }

    @GetMapping("/{city}/{name}")
    public String getCusCityAndName(@PathVariable("city") String city, @PathVariable("name") String name){
        return String.format("city : %s   |   name : %s",city,name);
    }

    @GetMapping("/customer/{id:C\\d{3}}")
    public String getCusById(@PathVariable("id") String id){
        return String.format("id : %s",id);
    }

}
