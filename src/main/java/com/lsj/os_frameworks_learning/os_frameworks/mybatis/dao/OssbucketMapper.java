package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Ossbucket;

public interface OssbucketMapper {
    int insert(Ossbucket record);

    int insertSelective(Ossbucket record);

    Ossbucket selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Ossbucket record);

    int updateByPrimaryKey(Ossbucket record);
}