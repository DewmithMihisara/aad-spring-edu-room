package lk.ijse.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    @Value("Chamath")
    private String name;
    public SpringBeanOne(@Value("puka") String myString){
        System.out.println("SpringBeanOne - Constructor() : " + myString);
        System.out.println("name : "+name);
    }
    @PostConstruct
    private void initialize(){
        System.out.println("name : "+name);
    }
}
