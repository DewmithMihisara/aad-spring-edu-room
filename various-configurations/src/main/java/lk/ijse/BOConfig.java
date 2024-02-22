package lk.ijse;

import lk.ijse.bo.BOSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BOConfig {
    @Bean
    public BOSpringBean boSpringBean(){
        return new BOSpringBean();
    }
}
