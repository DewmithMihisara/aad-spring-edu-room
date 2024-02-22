package lk.ijse;

import lk.ijse.bean.SpringBeanFour;
import lk.ijse.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    //SpringBeanTwo in full mode
    @Bean
    public SpringBeanTwo springBeanTwo(){
        System.out.println("SpringBeanTwo() method is involved");
        return new SpringBeanTwo(springBeanFour());
    }
    //SpringBeanTwo in full mode
    @Bean
    public SpringBeanFour springBeanFour(){
        System.out.println("SpringBeanFour() method is involved");
        return new SpringBeanFour();
    }
}
