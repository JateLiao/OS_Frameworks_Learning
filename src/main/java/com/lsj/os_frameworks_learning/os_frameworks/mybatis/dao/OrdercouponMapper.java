package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Ordercoupon;

public interface OrdercouponMapper {
    int insert(Ordercoupon record);

    int insertSelective(Ordercoupon record);

    Ordercoupon selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Ordercoupon record);

    int updateByPrimaryKey(Ordercoupon record);
}