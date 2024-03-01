package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanFour implements BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanFour(){
        System.out.println("SpringBeanFour - Constructor() : "+this);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanFour - BeanFactory Aware : "+this);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanFour - BeanName Aware : "+this);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanFour - Disposable Bean : "+this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanFour - Initializing Bean : "+this);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanFour - ApplicationContext Aware : "+this);
    }
}
