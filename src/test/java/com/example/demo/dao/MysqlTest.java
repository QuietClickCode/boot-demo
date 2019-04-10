package com.example.demo.dao;

import com.example.demo.DemosshApplication;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import javafx.application.Application;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zwq
 * @date 2018/10/16 14:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemosshApplication.class)
@WebAppConfiguration
public class MysqlTest {
    //qwe
    @Autowired
    private UserService userService;
    @Test
    public void t1(){
        User user = userService.selectByName("zwq");
        System.out.println(user);
    }
    @Test
    public void save(){
        User user = new User();
        user.setAge(18);
        user.setCustomerid(110);
        user.setUsername("zwq");
        user.setId(20);
        userService.save(user);
    }
}
