package com.mxb.blog.service;

import com.mxb.blog.dao.UserRepository;
import com.mxb.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @author Meng
 * @data 2022/6/16 13:50
 */
@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        //密码的MD5加密
        User user=userRepository.findByUsernameAndPassword(username, DigestUtils.md5DigestAsHex(password.getBytes()));
        return user;
    }
}
