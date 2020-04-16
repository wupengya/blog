package com.itwp.blog.service.impl;

import com.itwp.blog.dao.UserRepository;
import com.itwp.blog.entity.User;
import com.itwp.blog.utils.MD5Utils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.itwp.blog.service.UserService;
/**
 * Created by Carl Wu on 2020/3/29 2:08
 */ 
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
