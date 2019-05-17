package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Sharerreadnotes;

public interface SharerreadnotesMapper {
    int insert(Sharerreadnotes record);

    int insertSelective(Sharerreadnotes record);

    Sharerreadnotes selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Sharerreadnotes record);

    int updateByPrimaryKey(Sharerreadnotes record);
}