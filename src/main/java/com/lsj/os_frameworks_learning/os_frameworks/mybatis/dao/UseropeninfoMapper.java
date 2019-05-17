package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Useropeninfo;

public interface UseropeninfoMapper {
    int insert(Useropeninfo record);

    int insertSelective(Useropeninfo record);

    Useropeninfo selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Useropeninfo record);

    int updateByPrimaryKey(Useropeninfo record);
}