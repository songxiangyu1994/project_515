package top.gnibbuq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.gnibbuq.pojo.Commodity;
@Mapper
public interface CommodityMapper {
	List<Commodity> getAllCommodity();
}
