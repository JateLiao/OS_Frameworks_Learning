package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userclasslog;

public interface UserclasslogMapper {
    int insert(Userclasslog record);

    int insertSelective(Userclasslog record);

    Userclasslog selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Userclasslog record);

    int updateByPrimaryKey(Userclasslog record);
}