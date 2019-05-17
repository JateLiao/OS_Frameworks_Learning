package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmedia;

public interface WechatmediaMapper {
    int insert(Wechatmedia record);

    int insertSelective(Wechatmedia record);

    Wechatmedia selectByPrimaryKey(String key);

    int updateByPrimaryKeySelective(Wechatmedia record);

    int updateByPrimaryKey(Wechatmedia record);
}