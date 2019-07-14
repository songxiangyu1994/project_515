package top.gnibbuq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.gnibbuq.pojo.Commodity;
import top.gnibbuq.pojo.ResultInfo;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.FirstService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("index_page")
public class FirstController {
    @Autowired
    private FirstService firstService;
    @Autowired
    ResultInfo resultInfo;
    /**
     * 查询库存不足5个的商品并红色标出
     * @return 返回商品结果
     */
    @RequestMapping(value = "index" , method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo selectThingsLess(HttpSession session){
        User loginUser = (User) session.getAttribute("loginUser");
        if(loginUser==null){
            resultInfo = new ResultInfo(false,null,"您尚未登录，请登录！");
            return resultInfo;
        }
        List<Commodity> lseeCommodity = firstService.selectThingsLess();
        resultInfo = new ResultInfo(true,lseeCommodity,"查询信息如下");
        return resultInfo;
    }
}
