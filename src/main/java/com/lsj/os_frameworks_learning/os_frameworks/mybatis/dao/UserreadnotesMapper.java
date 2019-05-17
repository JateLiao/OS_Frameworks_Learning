package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userreadnotes;

public interface UserreadnotesMapper {
    int insert(Userreadnotes record);

    int insertSelective(Userreadnotes record);

    Userreadnotes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userreadnotes record);

    int updateByPrimaryKey(Userreadnotes record);
}