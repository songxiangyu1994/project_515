package top.gnibbuq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.gnibbuq.pojo.ResultInfo;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.LoginService;
import top.gnibbuq.utils.Md5Util;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private User user;
    @RequestMapping(value = "login" )
    @ResponseBody
    public ResultInfo loginByUsernamePassword(@RequestParam("username")String username, @RequestParam("password")String password, HttpSession session){
        ResultInfo resultInfo = null;
        if(username.equals(null)){
            resultInfo = new ResultInfo(false,null,"用户名不能为空");
            return resultInfo;
        }else if(password.equals(null)){
            resultInfo = new ResultInfo(false,null,"密码不能为空");
            return resultInfo;
        }else{
            try {
                user.setUsername(username);
                user.setPassword(Md5Util.encodeByMd5(password));
                User queryUser = loginService.login(user);
                if(queryUser==null){
                    resultInfo = new ResultInfo(false,null,"用户名或密码错误");
                    return resultInfo;
                }
                resultInfo = new ResultInfo(true,null,"登陆成功");
                //将用户的登录信息存入session中
                session.setAttribute("loginUser",queryUser);


            } catch (Exception e) {
                e.printStackTrace();
                resultInfo = new ResultInfo(false,null,"服务器忙，请稍后再试！");
                //将resultInfo转换为String
            }
            return resultInfo;
        }



    }


}
