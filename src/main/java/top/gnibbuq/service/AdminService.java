package top.gnibbuq.service;

import top.gnibbuq.pojo.Admin;
import top.gnibbuq.pojo.User;

import java.util.List;

public interface AdminService {

    List<User> queryByUsername(User user);



    List<Admin> queryByDepository(Admin admin);

    String addAdmin(Admin admin);
}
