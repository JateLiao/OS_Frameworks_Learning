package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Staticresource;

public interface StaticresourceMapper {
    int insert(Staticresource record);

    int insertSelective(Staticresource record);

    Staticresource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Staticresource record);

    int updateByPrimaryKey(Staticresource record);
}