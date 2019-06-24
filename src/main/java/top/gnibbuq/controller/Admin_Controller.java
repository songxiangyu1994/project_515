package top.gnibbuq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Admin_Controller {
    @GetMapping("admin_user")
    public String getAdmin(){
        return "admin_user";
    }
}


