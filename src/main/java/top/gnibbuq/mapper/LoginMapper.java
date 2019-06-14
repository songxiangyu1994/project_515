package top.gnibbuq.mapper;

import org.apache.ibatis.annotations.Param;
import top.gnibbuq.pojo.User;

public interface LoginMapper {
    User queryPasswordByUsername(@Param("username") String username);
}
