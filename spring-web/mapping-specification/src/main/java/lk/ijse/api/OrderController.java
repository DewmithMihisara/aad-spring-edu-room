package lk.ijse.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-14
 * @since 0.1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

//    @GetMapping
//    public String getOrder(@RequestHeader("X-token") String token) {
//        return String.format("get order (token=%s)", token);
//    }

//    @GetMapping
//    public String getOrder(@RequestHeader(value = "X-token", required = false) String token) {
//        return String.format("get order (token=%s)", token);
//    }

    @GetMapping(headers = "X-token")
    public String getOrder(@RequestHeader String token) {
        return String.format("get order (token=%s)", token);
    }

}
