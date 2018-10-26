package com.example.demo.service;

import com.example.demo.domain.User;

/**
 * @author zwq
 * Service
 * Created by zwq on 2018/3/9.
 */
public interface UserService {
    /**
     * 新增用户
     * @param user
     */
    void save(User user);

    /**
     * 根据用户名查询
     * @param name
     */
    User selectByName(String name);
}
