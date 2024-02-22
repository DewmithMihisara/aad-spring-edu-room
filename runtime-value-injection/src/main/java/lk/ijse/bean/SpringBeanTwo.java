package lk.ijse.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanTwo {
    @Value("${app.env1}")
    private String env1;

    @Value("${app.env2}")
    private String env2;

    @Value("${app.env3}")
    private String env3;

    @Value("${app.env4}")
    private int env4;

    //how to access os ev

//    public SpringBeanTwo(@Value("${USER}") String user) {
//        System.out.println("SpringBeanTwo : Constructor()");
//        System.out.println("user : " + user);
//    }

    //how to access JRE properties
    public SpringBeanTwo(@Value("${os.name}") String osName) {
        System.out.println("SpringBeanTwo : Constructor()");
        System.out.println("osName : " + osName);
    }

    @PostConstruct
    private void initialize() {
        System.out.println("env1 : " + env1);
        System.out.println("env2 : " + env2);
        System.out.println("env3 : " + env3);
        System.out.println("env4 : " + env4);
    }
}
