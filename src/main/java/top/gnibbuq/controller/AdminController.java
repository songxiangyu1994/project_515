package top.gnibbuq.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.gnibbuq.pojo.ResultInfo;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.AdminService;

@RestController
@RequestMapping("admin_user")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "addUser" )
    @ResponseBody
    public String addUser(User user, @RequestParam("username")String username){
        String jsonData = null;
        try {
            jsonData = adminService.addUser();
        } catch (Exception e) {
            e.printStackTrace();
            ResultInfo resultInfo = new ResultInfo(false,null,"服务器忙，请稍后再试！");
            //将resultInfo转换为String
            try {
                jsonData = new ObjectMapper().writeValueAsString(resultInfo);
            } catch (JsonProcessingException e1) {
                e1.printStackTrace();
            }

        }
        return jsonData;
    }


    @RequestMapping(value = "queryByUsername" )
    @ResponseBody
    public String queryByUsername(@RequestParam("username")String username ){
        String jsonData = null;
        try {
            jsonData = adminService.queryByUsername();
        } catch (Exception e) {
            e.printStackTrace();
            ResultInfo resultInfo = new ResultInfo(false,null,"服务器忙，请稍后再试！");
            //将resultInfo转换为String
            try {
                jsonData = new ObjectMapper().writeValueAsString(resultInfo);
            } catch (JsonProcessingException e1) {
                e1.printStackTrace();
            }

        }
        return jsonData;
    }




}
