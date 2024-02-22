package lk.ijse;

import lk.ijse.bean.AnnotationConfigSpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("lk.ijse.bean")
@ImportResource("classpath:context.xml")
public class AppConfig {
}
