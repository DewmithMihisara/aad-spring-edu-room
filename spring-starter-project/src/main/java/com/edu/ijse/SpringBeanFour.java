package com.edu.ijse;

import org.springframework.stereotype.Component;

@Component("four")
public class SpringBeanFour {
    public SpringBeanFour() {
        System.out.println("SpringBeanFour Instantiated");
    }
}
