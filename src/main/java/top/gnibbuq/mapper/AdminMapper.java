package top.gnibbuq.mapper;

import org.apache.ibatis.annotations.Param;
import top.gnibbuq.pojo.Admin;
import top.gnibbuq.pojo.User;

import java.util.List;

public interface AdminMapper {
    List<User> queryByUsername(@Param("username") String username);

    User queryUserByUsername(@Param("username") String username);

    User querySuperPasswordBySuperAdmin(String adminstr);

    int addDepository(@Param("depositoryName") String depository);

    void addAdmin(Admin admin);

    List<Admin> queryByDepository(@Param("depositoryName") String depository);



}
