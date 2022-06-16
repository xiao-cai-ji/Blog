package com.mxb.blog.service;

import com.mxb.blog.po.User;

public interface UserService {
    User checkUser(String name, String password);

}
