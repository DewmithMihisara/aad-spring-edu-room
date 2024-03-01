package lk.ijse;

import lk.ijse.dao.DAOSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.ijse.dao")
public class DAOConfig {
    @Bean
    public DAOSpringBean daoSpringBean(){
        return new DAOSpringBean();
    }
}
