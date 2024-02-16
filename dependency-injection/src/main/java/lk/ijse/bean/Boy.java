package lk.ijse.bean;

import jakarta.annotation.PostConstruct;
import lk.ijse.util.Injector;
import lk.ijse.util.WhitePussy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("lahiru")
public class Boy implements Injector, BeanFactoryAware, BeanNameAware, ApplicationContextAware, DisposableBean {

//    //property injection

//    @Autowired
//    private GoodGirl gf;

//    -----------------------------

//    //setter injection

//    private GoodGirl gf;
//    @Autowired
//    public void setGf(GoodGirl gf) {
//        this.gf = gf;
//    }

//    ----------------------------

//    //interface injection

//    private GoodGirl gf;
//    @Autowired
//    @Override
//    public void inject(GoodGirl gf) {
//        this.gf = gf;
//    }

//    -------------------------------

    //constructor injection

    private GoodGirl gf;
    @Autowired
    public Boy(@Qualifier("big ass") @WhitePussy GoodGirl gf){
        this.gf=gf;
    }

//    private GoodGirl gf;

    public Boy(){
        System.out.println("Boy -constructor");
        System.out.println("have i got a girl friend ? " + gf);
    }
    @PostConstruct
    public void initialize(){
        System.out.println("have i got a girl friend ? " + gf);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory is Set...."+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is Set...." + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is Destroyed....");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context is Set...."+applicationContext);
    }

    @Override
    public void inject(GoodGirl gf) {

    }
}
