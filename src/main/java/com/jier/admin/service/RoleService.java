package com.jier.admin.service;

import com.jier.admin.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> selectAllRole();
    int insertSelective(Role record);
    int deleteById(List<Integer> ids);
    int updateByPrimaryKeySelective(Role record);
}
