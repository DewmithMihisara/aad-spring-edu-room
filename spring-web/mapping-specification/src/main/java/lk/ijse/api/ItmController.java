package lk.ijse.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itm")

public class ItmController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String svItmJson(){
        return "I accept only application/json";
    }
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String svItmXml(){
        return "I accept only application/xml";
    }
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String svItmMultiForm(){
        return "I accept only multipart/form";
    }
}
