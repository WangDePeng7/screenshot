package com.example.demo.controller;

import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HuangYanfei on 2018/8/16.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public SysUser getOne() {
        return userService.getOne();
    }
}
