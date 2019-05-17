package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsgimage;

public interface WechatmpmsgimageMapper {
    int insert(Wechatmpmsgimage record);

    int insertSelective(Wechatmpmsgimage record);

    Wechatmpmsgimage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsgimage record);

    int updateByPrimaryKey(Wechatmpmsgimage record);
}