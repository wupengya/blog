package com.itwp.blog.service;

import com.itwp.blog.entity.User;

/**
 * Created by Carl Wu on 2020/3/29 2:08
 */ 
public interface UserService{


    User checkUser(String username, String password);
}
