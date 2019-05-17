package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsgvoice;

public interface WechatmpmsgvoiceMapper {
    int insert(Wechatmpmsgvoice record);

    int insertSelective(Wechatmpmsgvoice record);

    Wechatmpmsgvoice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsgvoice record);

    int updateByPrimaryKey(Wechatmpmsgvoice record);
}