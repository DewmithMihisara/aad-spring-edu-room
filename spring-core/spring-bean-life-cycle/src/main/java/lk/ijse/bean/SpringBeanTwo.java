package lk.ijse.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanTwo {
    @PostConstruct
    public void initialize(){
        System.out.println("Spring Bean Two Instantiated....");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Spring Bean Two is Destroyed....");
    }
}
