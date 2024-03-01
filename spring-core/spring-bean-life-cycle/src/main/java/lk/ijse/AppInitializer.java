package lk.ijse;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBean bean1 = ctx.getBean(SpringBean.class);
        System.out.println(bean1);

        System.out.println("--------------------------------");

        SpringBean bean2 = ctx.getBean(SpringBean.class);
        System.out.println(bean2);

        ctx.close();
    }
}