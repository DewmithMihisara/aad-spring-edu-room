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

//    =====================================
//    character mapping

    @GetMapping("ijse/gdse")
    public String getMapThree(){
        return "getMapThree()";
    }
    @GetMapping("ijse/gd?se???")
    public String getMapFour(){
        return "getMapFour()";
    }


//    =========================
//    wildcard mapping

//    @GetMapping("/ijse/*")
//    public String getMapFive(){
//        return "getMapFive()";
//    }

//    @GetMapping("/ijse/*/galle")
//    public String getMapSix(){
//        return "getMapSix()";
//    }
//    @GetMapping("/ijse/*/*/galle")
//    public String getMapSeven(){
//        return "getMapSeven()";
//    }
//
//    @GetMapping("/ijse/**")
//    public String getMapEight(){
//        return "getMapEight()";
//    }
//    @GetMapping("/ijse/galle*")
//    public String getMap9(){
//        return "getMap9()";
//    }
//        =========================
//    extension mapping

    @GetMapping("/*.html")
    public String getMap10(){
        return "getMap10()";
    }
}
