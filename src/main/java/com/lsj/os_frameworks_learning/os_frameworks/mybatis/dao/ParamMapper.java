package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Param;

public interface ParamMapper {
    int insert(Param record);

    int insertSelective(Param record);

    Param selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Param record);

    int updateByPrimaryKey(Param record);
}