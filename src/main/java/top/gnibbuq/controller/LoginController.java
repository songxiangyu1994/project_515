package top.gnibbuq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {
  /*  @Autowired
    private LoginService loginService;
    @RequestMapping(value = "addUser" )
    @ResponseBody
    public String addUser(User user, @RequestParam("username")String username){
        String jsonData = null;
        try {
            jsonData = loginService.addUser();
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
            jsonData = loginService.queryByUsername();
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




*/
}
