package org.fredmagine.myvue.controller;

import org.fredmagine.myvue.mapper.UserMapper;
import org.fredmagine.myvue.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/list")
    public String list() {
        System.out.println("Hello user");
        User u = userMapper.selectByPrimaryKey(1);
        return u.getName();
    }

    @RequestMapping("/add")
    public String add() {
        System.out.println("Hello user2");
        User u = new User();
        u.setId(3);
        u.setName("test");
        u.setPassword("abc");
        userMapper.insert(u);
        return u.getName();
    }

}
