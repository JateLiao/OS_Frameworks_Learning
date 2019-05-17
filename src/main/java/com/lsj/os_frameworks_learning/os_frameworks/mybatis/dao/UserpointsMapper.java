package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userpoints;

public interface UserpointsMapper {
    int insert(Userpoints record);

    int insertSelective(Userpoints record);

    Userpoints selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userpoints record);

    int updateByPrimaryKey(Userpoints record);
}