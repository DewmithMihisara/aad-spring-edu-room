package lk.ijse.bean;

import jakarta.annotation.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    private String name;
    private int age;
    private boolean isMale;
    private float temp;
//    public SpringBean() {
//        System.out.println("SpringBean - Constructor");
//    }
    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("Spring Bean :(String,int,boolean)");
        System.out.printf("name=%s, age=%s, isMale=%s\n", name, age, isMale);
    }
    public SpringBean(String name, int age, boolean isMale, @Nullable float temp) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.temp = temp;
        System.out.println("Spring Bean :(String,int,boolean,float)");
        System.out.printf("name=%s, age=%s, isMale=%s, temp=%s\n", name, age, isMale, temp);
    }

}
