package lk.ijse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

//        // access OS environment variables
//        Map<String, String> getenv = System.getenv();
//
//        for (Map.Entry<String, String> entry : getenv.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        System.out.println("===========================");
//
//        // access JRE environment variables
//        Properties properties = System.getProperties();
//
//        // set a new environment variable
//        properties.put("newKey", "newValue");
//
//        for(String key : properties.stringPropertyNames()){
//            System.out.println(key + " : " + properties.get(key));
//        }


    }
}