package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Betalist;

public interface BetalistMapper {
    int insert(Betalist record);

    int insertSelective(Betalist record);

    Betalist selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Betalist record);

    int updateByPrimaryKey(Betalist record);
}