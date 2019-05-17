package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Paramversionvalue;

public interface ParamversionvalueMapper {
    int insert(Paramversionvalue record);

    int insertSelective(Paramversionvalue record);

    Paramversionvalue selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Paramversionvalue record);

    int updateByPrimaryKey(Paramversionvalue record);
}