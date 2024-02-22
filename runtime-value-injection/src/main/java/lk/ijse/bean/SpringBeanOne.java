package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne(String myString){
        System.out.println("SpringBeanOne - Constructor() : " + myString);
    }
}
