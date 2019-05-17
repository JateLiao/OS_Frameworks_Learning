package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userlessonboxvisitor;

public interface UserlessonboxvisitorMapper {
    int insert(Userlessonboxvisitor record);

    int insertSelective(Userlessonboxvisitor record);

    Userlessonboxvisitor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userlessonboxvisitor record);

    int updateByPrimaryKey(Userlessonboxvisitor record);
}