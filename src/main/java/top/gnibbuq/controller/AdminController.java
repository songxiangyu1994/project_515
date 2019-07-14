package top.gnibbuq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.gnibbuq.pojo.Admin;
import top.gnibbuq.pojo.ResultInfo;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.AdminService;
import top.gnibbuq.utils.Md5Util;

import java.util.List;

@RestController
@RequestMapping("admin_user")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private Admin admin;
    @Autowired
    private User user;
    @Autowired
    ResultInfo resultInfo;
    @RequestMapping(value = "addUser" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addAdmin(@RequestParam("username")String username,@RequestParam("password")String password,
                           @RequestParam("depository")String depository,@RequestParam("superstr")String superstr){
        String msg = null;
        try {
            admin.setUsername(username);
            admin.setPassword(Md5Util.encodeByMd5(password));
            admin.setDepository(depository);
            admin.setAdminpassword(superstr);
            msg = adminService.addAdmin(admin);
            resultInfo = new ResultInfo(true,null,msg);
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo = new ResultInfo(false,null,"服务器忙，请稍后再试！");
           /* //将resultInfo转换为String
            try {
                jsonData = new ObjectMapper().writeValueAsString(resultInfo);
            } catch (JsonProcessingException e1) {
                e1.printStackTrace();
            }*/

        }
        return resultInfo;
    }


    @RequestMapping(value = "queryByUsername" ,method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo queryByUsername(@RequestParam("username")String username ){
        user.setUsername(username);
       /* String jsonData = null;*/
        try {
            List<User> users = adminService.queryByUsername(user);
            resultInfo = new ResultInfo(true,users,"这是所有的相关用户！");
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo = new ResultInfo(false,null,"服务器忙，请稍后再试！");
            /*//将resultInfo转换为String
            try {
                jsonData = new ObjectMapper().writeValueAsString(resultInfo);
            } catch (JsonProcessingException e1) {
                e1.printStackTrace();
            }*/

        }
        return resultInfo;
    }

    @RequestMapping(value = "queryByDepository" , method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo queryByDepository(@RequestParam("depository")String depository ){
        admin.setDepository(depository);
        /*String jsonData = null;*/
        try {
            List<Admin> admins = adminService.queryByDepository(admin);
            resultInfo = new ResultInfo(true,admins,"这是所有相关的仓库信息");
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo = new ResultInfo(false,null,"服务器忙，请稍后再试！");
            /*//将resultInfo转换为String
            try {
                jsonData = new ObjectMapper().writeValueAsString(resultInfo);
            } catch (JsonProcessingException e1) {
                e1.printStackTrace();
            }*/

        }
        return resultInfo;
    }


}
