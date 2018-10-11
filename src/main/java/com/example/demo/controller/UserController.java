package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author zwq
 * Controller
 * Created by zwq on 2018/3/9.
 */
@Controller
@EnableAutoConfiguration
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public String save(){

        User user = new User();
        user.setAge(18);
        user.setCustomerid(110);
        user.setUsername("zwq");
        user.setId(20);
        userService.save(user);
        return "insert success!";

    }

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    @ResponseBody
    public ModelAndView sayHello(){
        ModelAndView mode = new ModelAndView();
        mode.setViewName("index");
        return mode;
    }


    @RequestMapping(value="/index")
    public String home(){
        System.out.println("redirect to home page!");
        return "index";
    }


}
