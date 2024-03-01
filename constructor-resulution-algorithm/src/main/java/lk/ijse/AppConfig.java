package lk.ijse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public String myName(){
        return "Perera";
    }
    @Bean
    public Integer myInt(){
        return 31;
    }
    @Bean
    public Boolean isMale(){
        return true;
    }
}
