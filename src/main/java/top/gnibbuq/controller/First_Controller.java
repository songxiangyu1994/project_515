package top.gnibbuq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class First_Controller {


    @GetMapping("index_page")
    public String getAdmin(){
            return "index_page";
        }

}
