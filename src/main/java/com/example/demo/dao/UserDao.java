package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/3/9.
 */
//@Repository
//@Table(name="user")
//@Qualifier("userDao")
@CacheConfig(cacheNames = "users")
public interface UserDao extends JpaRepository<User, Long> {
    @Cacheable(key = "#p0")
    public User save(User user);
}
