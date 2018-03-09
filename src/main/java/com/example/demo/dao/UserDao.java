package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/3/9.
 */
//@Repository
//@Table(name="user")
//@Qualifier("userDao")
public interface UserDao extends JpaRepository<User, Long> {
    public User save(User user);
}
