package top.gnibbuq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.gnibbuq.pojo.Commodity;
import top.gnibbuq.pojo.ResultInfo;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.CommodityService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("commodity_page")
public class CommodityController {
	@Autowired
	CommodityService commodityService;
	@Autowired
	ResultInfo resultInfo ;
	@RequestMapping(value = "allCommodity" , method = RequestMethod.GET )
	@ResponseBody
	public ResultInfo selectAllCommodity(HttpSession session){
		User loguser = (User)session.getAttribute("loginUser");
		if(loguser==null) {
			resultInfo = new ResultInfo(false,null,"您尚未登陆");
			return resultInfo;
		}
		List<Commodity> allCommodity = commodityService.getAllCommodity();
		resultInfo = new ResultInfo(true,allCommodity,"这是后台的数据");
			
		return resultInfo;
	}
}
