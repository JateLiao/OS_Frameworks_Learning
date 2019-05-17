package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Couponinfo;

public interface CouponinfoMapper {
    int insert(Couponinfo record);

    int insertSelective(Couponinfo record);

    Couponinfo selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Couponinfo record);

    int updateByPrimaryKey(Couponinfo record);
}