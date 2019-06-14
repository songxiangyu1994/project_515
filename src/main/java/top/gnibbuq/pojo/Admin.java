package top.gnibbuq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 管理账户表
 */
@Component
@Data
public class Admin {
    //用户名
    private String username;
    //仓库名称
    private String depository;
    //仓库ID
    private int depositoryId;
    //密码
    private String password;
    //超级管理员密码
    private String adminpassword;
}
