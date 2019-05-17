package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsgtext;

public interface WechatmpmsgtextMapper {
    int insert(Wechatmpmsgtext record);

    int insertSelective(Wechatmpmsgtext record);

    Wechatmpmsgtext selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsgtext record);

    int updateByPrimaryKey(Wechatmpmsgtext record);
}