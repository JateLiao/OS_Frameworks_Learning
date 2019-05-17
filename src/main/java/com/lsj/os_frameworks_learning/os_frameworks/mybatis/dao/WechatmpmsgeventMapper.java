package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsgevent;

public interface WechatmpmsgeventMapper {
    int insert(Wechatmpmsgevent record);

    int insertSelective(Wechatmpmsgevent record);

    Wechatmpmsgevent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsgevent record);

    int updateByPrimaryKey(Wechatmpmsgevent record);
}