package lk.ijse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        //create the application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();


        //get bean can use for get the object from application context
        AppConfig bean = ctx.getBean(AppConfig.class);
        System.out.println(bean);
    }
}