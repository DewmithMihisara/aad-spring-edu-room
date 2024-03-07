package lk.ijse.api;

import lk.ijse.entity.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqBody {
    @PostMapping("/svCus")
    public String svCus(@RequestBody String id, @RequestBody String name, @RequestBody String age){
        return String.format("id:%s  |  name:%s  |  age:%s",id,name,age);
    }

    @PostMapping(value = "/svStd")
    public String svStd(@ModelAttribute Student std){
        return std.toString();
    }
}
