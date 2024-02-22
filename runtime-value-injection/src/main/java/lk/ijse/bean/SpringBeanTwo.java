package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo {
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

}
