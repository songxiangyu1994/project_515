package top.gnibbuq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Merchants_Controller {
    @GetMapping("merchants_page")
    public String getMerchants(){
        return "merchants_page";
    }
}
