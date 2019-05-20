package top.gnibbuq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Commodity_Controller {
    @GetMapping("commodity_page")
    public String getCommodity(){
        return "page2";
    }
}
