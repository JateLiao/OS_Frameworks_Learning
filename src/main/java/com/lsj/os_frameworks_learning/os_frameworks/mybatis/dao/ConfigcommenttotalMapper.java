package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Configcommenttotal;

public interface ConfigcommenttotalMapper {
    int insert(Configcommenttotal record);

    int insertSelective(Configcommenttotal record);

    Configcommenttotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Configcommenttotal record);

    int updateByPrimaryKey(Configcommenttotal record);
}