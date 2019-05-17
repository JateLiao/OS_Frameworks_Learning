package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatvisitorbind;

public interface WechatvisitorbindMapper {
    int insert(Wechatvisitorbind record);

    int insertSelective(Wechatvisitorbind record);

    Wechatvisitorbind selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wechatvisitorbind record);

    int updateByPrimaryKey(Wechatvisitorbind record);
}