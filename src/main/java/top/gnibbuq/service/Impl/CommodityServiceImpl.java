package top.gnibbuq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.gnibbuq.mapper.CommodityMapper;
import top.gnibbuq.pojo.Commodity;
import top.gnibbuq.service.CommodityService;

import java.util.List;
@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityMapper commodityMapper;
    @Override
    public List<Commodity> getAllCommodity() {
    	List<Commodity> list = commodityMapper.getAllCommodity();
        return list;
    }
}
