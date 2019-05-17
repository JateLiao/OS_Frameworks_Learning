package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userclass;

public interface UserclassMapper {
    int insert(Userclass record);

    int insertSelective(Userclass record);

    Userclass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userclass record);

    int updateByPrimaryKey(Userclass record);
}