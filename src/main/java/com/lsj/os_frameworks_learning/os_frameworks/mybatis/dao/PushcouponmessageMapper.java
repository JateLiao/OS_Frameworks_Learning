package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Pushcouponmessage;

public interface PushcouponmessageMapper {
    int insert(Pushcouponmessage record);

    int insertSelective(Pushcouponmessage record);

    Pushcouponmessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pushcouponmessage record);

    int updateByPrimaryKey(Pushcouponmessage record);
}