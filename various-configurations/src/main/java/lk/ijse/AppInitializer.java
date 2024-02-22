package lk.ijse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
//        context.register(DAOConfig.class);
//        context.register(BOConfig.class);
        context.refresh();
        context.registerShutdownHook();
    }
}