package lk.ijse.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/two")
public class MyController2 {
    public MyController2() {
        System.out.println("MyController2 Instantiated -constructor()");
    }
    @GetMapping
    public String hello(){
        return "someThing";
    }
}
