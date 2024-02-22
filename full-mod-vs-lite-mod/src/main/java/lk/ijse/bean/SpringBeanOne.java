package lk.ijse.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//SpringBeanOne in full mode
@Component
public class SpringBeanOne {
    public SpringBeanOne(){
        System.out.println("SpringBeanOne - Constructor()");
    }

    //SpringBeanThree in lite mode
    @Bean
    public SpringBeanThree springBeanThree(){
        return new SpringBeanThree();
    }

//    @Bean
//    public SpringBeanTwo springBeanTwo(){
//        System.out.println("SpringBeanTwo() method is involved");
//        return new SpringBeanTwo(springBeanFour());
//    }
//
//    @Bean
//    public SpringBeanFour springBeanFour(){
//        System.out.println("SpringBeanFour() method is involved");
//        return new SpringBeanFour();
//    }
}
