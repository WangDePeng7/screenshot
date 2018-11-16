package com.example.demo.mapper;

import com.example.demo.model.SysRole;
import org.springframework.stereotype.Repository;

/**
 * SysRoleDAO继承基类
 */
@Repository
public interface SysRoleDAO extends MyBatisBaseDao<SysRole, Integer, SysRole> {
}