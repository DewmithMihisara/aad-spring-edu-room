package com.edu.ijse;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("four")
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SpringBeanFour {
    public SpringBeanFour() {
        System.out.println("SpringBeanFour Instantiated");
    }
}
