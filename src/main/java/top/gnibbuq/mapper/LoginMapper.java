package top.gnibbuq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.gnibbuq.pojo.User;
@Mapper
public interface LoginMapper {
    User queryPasswordByUsername(@Param("username") String username);
}
