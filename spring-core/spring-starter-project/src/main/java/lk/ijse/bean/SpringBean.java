package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component(value = "springBean")
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean Instantiated");
    }
}
