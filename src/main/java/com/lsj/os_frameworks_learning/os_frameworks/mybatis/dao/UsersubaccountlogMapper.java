package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Usersubaccountlog;

public interface UsersubaccountlogMapper {
    int insert(Usersubaccountlog record);

    int insertSelective(Usersubaccountlog record);

    Usersubaccountlog selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Usersubaccountlog record);

    int updateByPrimaryKey(Usersubaccountlog record);
}