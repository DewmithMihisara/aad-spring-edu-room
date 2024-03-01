package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    private String name;
    private int age;
    private boolean isMale;
    private float temp;

    public SpringBean() {
        System.out.println("SpringBean - Constructor");
    }



}
