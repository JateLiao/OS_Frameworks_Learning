package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Couponsend;

public interface CouponsendMapper {
    int insert(Couponsend record);

    int insertSelective(Couponsend record);

    Couponsend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Couponsend record);

    int updateByPrimaryKey(Couponsend record);
}