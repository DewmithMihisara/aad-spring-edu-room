package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanFour implements BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanFour(){
        System.out.println("SpringBeanFour - Constructor()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanFour - BeanFactory Aware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanFour - BeanName Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanFour - Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanFour - Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanFour - ApplicationContext Aware");
    }
}
