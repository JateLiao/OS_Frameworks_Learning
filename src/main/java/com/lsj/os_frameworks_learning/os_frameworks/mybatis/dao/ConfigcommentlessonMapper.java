package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Configcommentlesson;

public interface ConfigcommentlessonMapper {
    int insert(Configcommentlesson record);

    int insertSelective(Configcommentlesson record);

    Configcommentlesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Configcommentlesson record);

    int updateByPrimaryKey(Configcommentlesson record);
}