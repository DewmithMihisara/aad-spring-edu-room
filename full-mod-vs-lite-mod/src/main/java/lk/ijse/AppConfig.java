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
        return new SpringBeanTwo(springBeanFour());
    }

    @Bean
    public SpringBeanFour springBeanFour(){
        return new SpringBeanFour();
    }
}
