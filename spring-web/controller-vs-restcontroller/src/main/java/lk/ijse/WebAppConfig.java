package lk.ijse;

import lk.ijse.api.MyController1;
import lk.ijse.api.MyController2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("WebAppConfig Instantiated -constructor()");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/WEB-INF/pages/**").addResourceLocations("/WEB-INF/WEB-INF/pages/");
    }
    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/WEB-INF/WEB-INF/pages/", ".html");
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
