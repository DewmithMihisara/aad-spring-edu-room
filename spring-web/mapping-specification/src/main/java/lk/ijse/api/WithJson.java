package lk.ijse.api;

import lk.ijse.entity.Student;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WithJson {

//    @PostMapping("/jsn")
//    public String sv( String id,  String name,  String age) {
//        return String.format("id:%s   |   name:%s     |   age:%s", id, name, age);
//    }

    @PostMapping("/jsn")
    public String sv(@RequestBody Student std) {
        return std.toString();
    }

    @GetMapping(value = "/gt", produces = "application/json")
    public Student gt() {
        return new Student("c001","amal",20);
    }

    @GetMapping(value = "gtAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Student>gtAll(){
        ArrayList<Student>st=new ArrayList<>();
        st.add(new Student("st001","amal",20));
        st.add(new Student("st002","nimal",30));
        st.add(new Student("st003","kamal",40));
        return st;
    }
}
