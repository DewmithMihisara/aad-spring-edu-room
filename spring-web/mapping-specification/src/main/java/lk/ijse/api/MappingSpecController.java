package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MappingSpecController {
    @GetMapping
    public String getMapOne(){
        return "getMapOne()";
    }

//    can  set path using this ways
//    ==================================
//    path mapping
//    @GetMapping(path = "/ijse")
    @GetMapping("/ijse")

    public String getMapTwo(){
        return "getMapTwo()";
    }
}
