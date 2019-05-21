package top.gnibbuq.service;

import top.gnibbuq.pojo.User;

public interface AdminService {

    String queryByUsername(User user);

    String addUser(User user);
}
