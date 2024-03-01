package lk.ijse.bean;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWebMVC {
    @GetMapping("/get")
    public String get(){
        return "get()";
    }
    @DeleteMapping("/del")
    public String delete(){
        return "delete()";
    }
    @PostMapping("/post")
    public String post(){
        return "post()";
    }
    @PutMapping("/put")
    public String put(){
        return "put()";
    }
    @PatchMapping("/patch")
    public String patch(){
        return "patch()";
    }
    @RequestMapping("/req")
    public String req(){
        return "req()";
    }
}
