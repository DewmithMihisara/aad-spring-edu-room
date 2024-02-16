package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class SpringBean {
    public SpringBean(@Qualifier("puka-sudui")String[]name){
        System.out.println("SpringBean - Constructor");
        System.out.println(Arrays.toString(name));
    }

//    public SpringBean(List<String>name){
//        System.out.println("SpringBean - Constructor()");
//        System.out.println(name.toString());
//    }

//    public SpringBean(Set<String>name){
//        System.out.println("SpringBean - Constructor()");
//        System.out.println(name.toString());
//    }

//    public SpringBean(Map<String,String> name){
//        System.out.println("SpringBean - Constructor()");
//        System.out.println(name.toString());
//    }

}
