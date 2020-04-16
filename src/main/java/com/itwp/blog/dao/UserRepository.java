package com.itwp.blog.dao;

import com.itwp.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Carl Wu on 2020/3/29 14:01
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String code);
}
