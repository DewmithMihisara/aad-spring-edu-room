package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean(){
        System.out.println("Spring Bean Instantiated....");
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
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is Initialized....");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context is Set...."+applicationContext);
    }
}
