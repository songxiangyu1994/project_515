package top.gnibbuq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gnibbuq.mapper.LoginMapper;
import top.gnibbuq.pojo.User;
import top.gnibbuq.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    User queryUser;
    @Override
    public User login(User user) {

        queryUser = loginMapper.queryPasswordByUsername(user.getUsername());
        if(queryUser==null){
            return null;
        }
        if(queryUser.getPassword().equals(user.getPassword())){
            return queryUser;
        }
        return null;
    }
}
