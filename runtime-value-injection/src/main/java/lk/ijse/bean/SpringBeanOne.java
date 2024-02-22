package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne(@Value("puka") String myString){
        System.out.println("SpringBeanOne - Constructor() : " + myString);
    }
}
