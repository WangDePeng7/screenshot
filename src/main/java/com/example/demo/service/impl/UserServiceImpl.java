package com.example.demo.service.impl;

import com.example.demo.mapper.SysUserDAO;
import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HuangYanfei on 2018/8/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    SysUserDAO sysUserDAO;

    @Override
    public SysUser getOne() {
        return sysUserDAO.selectByPrimaryKey(1);
    }
}
