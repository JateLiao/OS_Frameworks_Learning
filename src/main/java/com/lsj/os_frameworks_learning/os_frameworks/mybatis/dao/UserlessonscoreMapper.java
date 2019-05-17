package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userlessonscore;

public interface UserlessonscoreMapper {
    int insert(Userlessonscore record);

    int insertSelective(Userlessonscore record);

    Userlessonscore selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Userlessonscore record);

    int updateByPrimaryKey(Userlessonscore record);
}