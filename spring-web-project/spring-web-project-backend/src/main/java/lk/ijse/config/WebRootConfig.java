package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
@Configuration
@ComponentScan(basePackages = {"lk.ijse.service","lk.ijse.repositories"})
@EnableWebMvc
@Import(JPAConfig.class)
@PropertySource("classpath:application.properties")
public class WebRootConfig {

}
