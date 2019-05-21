package top.gnibbuq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public String queryByUsername(User user) {
        List<User> userList = adminMapper.queryByUsername(user);
        
        return null;
    }

    @Override
    public String addUser(User user) {

        return null;
    }
}
