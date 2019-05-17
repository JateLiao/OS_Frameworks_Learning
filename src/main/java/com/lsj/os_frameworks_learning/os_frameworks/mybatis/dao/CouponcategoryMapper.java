package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Couponcategory;

public interface CouponcategoryMapper {
    int insert(Couponcategory record);

    int insertSelective(Couponcategory record);

    Couponcategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Couponcategory record);

    int updateByPrimaryKey(Couponcategory record);
}