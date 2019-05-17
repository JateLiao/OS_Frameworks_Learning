package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsgvideo;

public interface WechatmpmsgvideoMapper {
    int insert(Wechatmpmsgvideo record);

    int insertSelective(Wechatmpmsgvideo record);

    Wechatmpmsgvideo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsgvideo record);

    int updateByPrimaryKey(Wechatmpmsgvideo record);
}