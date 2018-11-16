package com.example.demo.mapper;

import com.example.demo.model.SysUser;
import org.springframework.stereotype.Repository;

/**
 * SysUserDAO继承基类
 */
@Repository
public interface SysUserDAO extends MyBatisBaseDao<SysUser, Integer, SysUser> {
}