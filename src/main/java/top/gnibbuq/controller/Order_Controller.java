package top.gnibbuq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Order_Controller {
    @GetMapping("order_page")
    public String getOrder(){
        return "page1";
    }
}
