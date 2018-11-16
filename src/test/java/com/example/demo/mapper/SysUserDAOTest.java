package com.example.demo.mapper;

import com.example.demo.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by HuangYanfei on 2018/8/16.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SysUserDAOTest {

    @Autowired
    SysUserDAO sysUserDAO;

    @Test
    public void test() {
        SysUser user = sysUserDAO.selectByPrimaryKey(1);
        System.out.println(user.getUsername());
    }
}