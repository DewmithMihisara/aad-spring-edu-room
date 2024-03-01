package lk.ijse;

import lk.ijse.api.MyController1;
import lk.ijse.api.MyController2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig Instantiated -constructor()");
    }
    @Bean
    public MyController1 myController1(){
        return new MyController1();
    }

    @Bean
    public MyController2 myController2(){
        return new MyController2();
    }
}
