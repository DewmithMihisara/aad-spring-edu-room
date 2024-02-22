package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo {
    public SpringBeanTwo(@Value("${USER}") String user) {
        System.out.println("SpringBeanTwo : Constructor()");
        System.out.println("user : " + user);
    }

}
