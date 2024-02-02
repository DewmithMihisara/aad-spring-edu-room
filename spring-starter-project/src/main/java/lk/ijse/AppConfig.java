package lk.ijse;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringBean.class)
//@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Instantiated");
    }
}
