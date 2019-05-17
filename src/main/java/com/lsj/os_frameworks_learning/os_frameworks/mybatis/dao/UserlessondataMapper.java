package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userlessondata;

public interface UserlessondataMapper {
    int insert(Userlessondata record);

    int insertSelective(Userlessondata record);

    Userlessondata selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Userlessondata record);

    int updateByPrimaryKey(Userlessondata record);
}