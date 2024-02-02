package lk.ijse;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        //create the application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);

        //when add configuration class to the application context, need to refresh the application context(best practice)
        ctx.refresh();


        //get bean can use for get the object from application context
        AppConfig bean = ctx.getBean(AppConfig.class);
        System.out.println(bean);

        SpringBean bean1 = ctx.getBean(SpringBean.class);
        System.out.println(bean1);

        //to find JVM shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("JVM Shutdown Hook");

                //close the application context(best practice)
                ctx.close();
            }
        });
    }
}