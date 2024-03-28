package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
@Configuration
@ComponentScan(basePackages = "lk.ijse.service")
@Import(JPAConfig.class)
public class WebRootConfig {
}
