package top.gnibbuq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.gnibbuq.mapper.AdminMapper;
import top.gnibbuq.pojo.Admin;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    String adminstr = "admin";
    @Autowired
    //private AdminMapper adminMapper;
    @Override
    public String queryByUsername(Admin admin) {
        List<User> userList = adminMapper.queryByUsername(admin.getUsername());

        return null;
    }

    @Override
    public String addAdmin(Admin admin) {

        User queryUser = adminMapper.queryUserByUsername(admin.getUsername());

        User superUser = adminMapper.querySuperPasswordBySuperAdmin(adminstr);

        String depositoryId = adminMapper.addDepository(admin.getDepository());

        admin.setDepositoryId(depositoryId);

        adminMapper.addAdmin(admin);
        return null;
    }
}
