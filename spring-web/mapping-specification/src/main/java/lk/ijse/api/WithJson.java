package lk.ijse.api;

import lk.ijse.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
//        return ResponseEntity.status(200).body(new Student("c001","amal",20));
        return new Student("c001","amal",20);
    }
}
