package top.gnibbuq.mapper;

import org.apache.ibatis.annotations.Param;
import top.gnibbuq.pojo.Admin;
import top.gnibbuq.pojo.User;

import java.util.List;

public interface AdminMapper {


    void addAdmin (Admin admin);

    List<User> queryByUsername(@Param("username") String username);

    User queryUserByUsername(@Param("username") String username);

    User querySuperPasswordBySuperAdmin(String adminstr);

    String addDepository(@Param("depositoryName") String depository);
}
