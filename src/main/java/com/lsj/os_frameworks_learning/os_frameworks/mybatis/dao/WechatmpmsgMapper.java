package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsg;

public interface WechatmpmsgMapper {
    int insert(Wechatmpmsg record);

    int insertSelective(Wechatmpmsg record);

    Wechatmpmsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsg record);

    int updateByPrimaryKey(Wechatmpmsg record);
}