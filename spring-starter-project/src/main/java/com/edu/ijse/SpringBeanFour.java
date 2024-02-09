package com.edu.ijse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("four")
@Scope("prototype")
public class SpringBeanFour {
    public SpringBeanFour() {
        System.out.println("SpringBeanFour Instantiated");
    }
}
