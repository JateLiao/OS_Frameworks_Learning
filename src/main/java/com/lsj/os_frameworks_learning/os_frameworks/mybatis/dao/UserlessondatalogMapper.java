package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userlessondatalog;

public interface UserlessondatalogMapper {
    int insert(Userlessondatalog record);

    int insertSelective(Userlessondatalog record);

    Userlessondatalog selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Userlessondatalog record);

    int updateByPrimaryKey(Userlessondatalog record);
}