package lk.ijse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-14
 * @since 1.0.0
 */
@Configuration
@ComponentScan
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
}
