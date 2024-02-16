package lk.ijse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan

public class AppConfig {
    @Bean
    @Order(2)
    public String name1(){
        return "IJSE";
    }

    @Bean
    @Order(3)
    public String name2(){
        return "Esoft";
    }

    @Bean
    @Order(1)
    public String name3(){
        return "NSBM";
    }
}
