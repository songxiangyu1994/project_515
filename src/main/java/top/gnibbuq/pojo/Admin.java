package top.gnibbuq.pojo;

import lombok.Data;

/**
 * 管理账户表
 */
@Data
public class Admin {
    //用户名
    private String username;
    //仓库名称
    private String depository;
    //仓库ID
    private String depositoryId;
    //密码
    private String password;
    //超级管理员密码
    private String adminpassword;
}
