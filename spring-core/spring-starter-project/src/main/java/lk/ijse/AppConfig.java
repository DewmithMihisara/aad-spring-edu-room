package lk.ijse;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBeanFour;
import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan
@ComponentScan(basePackageClasses = {SpringBean.class, SpringBeanFour.class})
//@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
//    public AppConfig() {
//        System.out.println("AppConfig Instantiated");
//    }



//    @Bean
    @Bean(name = "javaBean")
    @Scope("prototype")
    public JavaBean getJavaBean(){
        return new JavaBean();
    }
}
