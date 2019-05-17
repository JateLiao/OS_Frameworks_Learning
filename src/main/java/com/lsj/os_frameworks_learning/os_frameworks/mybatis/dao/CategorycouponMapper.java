package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Categorycoupon;

public interface CategorycouponMapper {
    int insert(Categorycoupon record);

    int insertSelective(Categorycoupon record);

    Categorycoupon selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Categorycoupon record);

    int updateByPrimaryKey(Categorycoupon record);
}