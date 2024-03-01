package lk.ijse.bean;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebMVC {
    public HelloWebMVC() {
        System.out.println("HelloWebMVC - constructor()");
    }
}
