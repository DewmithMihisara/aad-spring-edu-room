package lk.ijse.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class SpringBeanOne {
    @Value("Chamath")
    private String name;
    public SpringBeanOne(@Value("test Name") String string,
                         @Value("5") int no,
                         @Value("5.5") double doubleNO,
                         @Value("true") boolean bool,
                         @Value("5,6,7,8") int[] arr,
                         @Value("5,6,7,8") List<String> list,
                         @Value("A,B,C,D")Set<String> set){


        System.out.println("SpringBeanOne - Constructor()");

        System.out.println("string : "+string);
        System.out.println("no : "+no);
        System.out.println("doubleNO : "+doubleNO);
        System.out.println("bool : "+bool);
        System.out.println("arr : "+ Arrays.toString(arr));
        System.out.println("list : "+list);
        System.out.println("set : " + set);
    }

    @PostConstruct
    private void initialize(){
//        System.out.println("name : "+name);
    }
}
