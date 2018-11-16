package com.example.demo.mapper;

import com.example.demo.model.SysRoleUser;
import org.springframework.stereotype.Repository;

/**
 * SysRoleUserDAO继承基类
 */
@Repository
public interface SysRoleUserDAO extends MyBatisBaseDao<SysRoleUser, Integer, SysRoleUser> {
}