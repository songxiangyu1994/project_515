package top.gnibbuq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 登录表
 */
@Component
@Data
public class User {
    //用户名
    private String username;
    //密码
    private String password;
}
