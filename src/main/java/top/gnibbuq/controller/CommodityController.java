package top.gnibbuq.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import top.gnibbuq.pojo.ResultInfo;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.CommodityService;

@RestController
@RequestMapping("commodity_page")
public class CommodityController {
	@Autowired
	CommodityService commodityService;
	@RequestMapping(value = "allCommodity" )
	@ResponseBody
	public ResultInfo selectAllCommodity(HttpSession session){
		ResultInfo resultInfo = null;
		User loguser = (User)session.getAttribute("loginUser");
		if(loguser==null) {
			resultInfo = new ResultInfo(false,null,"您尚未登陆");
			return resultInfo;
		}
		List<Commodity> allCommodity = 
			
		return resultInfo;
	}
}
