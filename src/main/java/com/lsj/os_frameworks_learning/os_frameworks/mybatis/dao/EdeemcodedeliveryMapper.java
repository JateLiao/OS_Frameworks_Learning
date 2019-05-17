package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Edeemcodedelivery;

public interface EdeemcodedeliveryMapper {
    int insert(Edeemcodedelivery record);

    int insertSelective(Edeemcodedelivery record);

    Edeemcodedelivery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Edeemcodedelivery record);

    int updateByPrimaryKey(Edeemcodedelivery record);
}