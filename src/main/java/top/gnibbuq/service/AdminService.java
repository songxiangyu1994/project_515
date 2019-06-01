package top.gnibbuq.service;

import top.gnibbuq.pojo.Admin;

public interface AdminService {

    String queryByUsername(Admin admin);

    String addAdmin(Admin admin);
}
