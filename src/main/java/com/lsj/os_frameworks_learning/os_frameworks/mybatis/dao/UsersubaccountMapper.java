package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Usersubaccount;

public interface UsersubaccountMapper {
    int insert(Usersubaccount record);

    int insertSelective(Usersubaccount record);

    Usersubaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usersubaccount record);

    int updateByPrimaryKey(Usersubaccount record);
}