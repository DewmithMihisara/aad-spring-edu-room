package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/map")
public class MappingSpecController {

    @GetMapping
    public String getMap(){
        return "getMapMethod()";
    }
}
