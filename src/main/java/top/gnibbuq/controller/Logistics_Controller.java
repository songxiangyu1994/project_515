package top.gnibbuq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Logistics_Controller {
    @GetMapping("logistics_page")
    public String getLogistics(){
        return "page3";
    }
}
