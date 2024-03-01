package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class MyController1 {
    public MyController1() {
        System.out.println("MyController1 Instantiated -constructor()");
    }
    @GetMapping
    public String hello(){
        return "Hello from MyController1";
    }
}
