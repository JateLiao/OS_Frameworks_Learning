package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsglink;

public interface WechatmpmsglinkMapper {
    int insert(Wechatmpmsglink record);

    int insertSelective(Wechatmpmsglink record);

    Wechatmpmsglink selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsglink record);

    int updateByPrimaryKey(Wechatmpmsglink record);
}