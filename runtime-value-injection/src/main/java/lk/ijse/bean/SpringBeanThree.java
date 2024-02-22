package lk.ijse.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {
    @Autowired
    private Environment env;
    public SpringBeanThree() {
        System.out.println("SpringBeanThree : Constructor()");
    }
    @PostConstruct
    private void initialize() {
        System.out.println(env.getProperty("app.env1"));
        System.out.println(env.getProperty("app.env2"));
        System.out.println(env.getProperty("app.env3"));
        System.out.println(env.getProperty("app.env4"));
        System.out.println(env.getProperty("os.name"));
        System.out.println(env.getProperty("USER"));
    }
}
