package lk.ijse.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sachini")
@Primary
@Qualifier("big ass")
public class Sachini implements GoodGirl, BeanNameAware, BeanFactoryAware, DisposableBean {
    public Sachini(){
        System.out.println("Sachini -constructor");
    }
    @PostConstruct
    public void init(){
        System.out.println("Sachini -init-method");
    }
    @Override
    public void love() {
        System.out.println("Sachini loves him");
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
}
