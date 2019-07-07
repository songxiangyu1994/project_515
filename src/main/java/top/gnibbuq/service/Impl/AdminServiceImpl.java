package top.gnibbuq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.gnibbuq.mapper.AdminMapper;
import top.gnibbuq.pojo.Admin;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.AdminService;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {
    String adminstr = "admin";

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<User> queryByUsername(User user) {
        List<User> users = adminMapper.queryByUsername(user.getUsername());

        return users;
    }

    @Override
    @Transactional
    public String addAdmin(Admin admin) {

        User queryUser = adminMapper.queryUserByUsername(admin.getUsername());

        if(queryUser!=null){
            return "有这个用户名，不能创建！";
        }


        User superUser = adminMapper.querySuperPasswordBySuperAdmin(adminstr);
        if(!superUser.getPassword().equals(admin.getAdminpassword())){
            return "超级管理员密码错误，您可能没有这个权限！";
        }

        int depositoryId = adminMapper.addDepository(admin.getDepository());

        admin.setDepositoryId(depositoryId);


        adminMapper.addAdmin(admin);
        return "创建新用户成功！";
    }

    @Override
    public List<Admin> queryByDepository(Admin admin) {
        List<Admin> admins = adminMapper.queryByDepository(admin.getDepository());

        return admins;
    }
}
