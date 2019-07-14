package top.gnibbuq.mapper;

import top.gnibbuq.pojo.Commodity;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface FirstMapper {
    List<Commodity> selectThingsLess();

}
