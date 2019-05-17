package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Ossbucketresource;

public interface OssbucketresourceMapper {
    int insert(Ossbucketresource record);

    int insertSelective(Ossbucketresource record);

    Ossbucketresource selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Ossbucketresource record);

    int updateByPrimaryKey(Ossbucketresource record);
}