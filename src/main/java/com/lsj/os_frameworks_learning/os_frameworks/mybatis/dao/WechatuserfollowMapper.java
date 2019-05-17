package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatuserfollow;

public interface WechatuserfollowMapper {
    int insert(Wechatuserfollow record);

    int insertSelective(Wechatuserfollow record);

    Wechatuserfollow selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Wechatuserfollow record);

    int updateByPrimaryKey(Wechatuserfollow record);
}