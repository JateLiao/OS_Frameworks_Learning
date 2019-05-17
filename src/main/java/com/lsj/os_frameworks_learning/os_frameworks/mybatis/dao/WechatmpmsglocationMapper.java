package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatmpmsglocation;

public interface WechatmpmsglocationMapper {
    int insert(Wechatmpmsglocation record);

    int insertSelective(Wechatmpmsglocation record);

    Wechatmpmsglocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatmpmsglocation record);

    int updateByPrimaryKey(Wechatmpmsglocation record);
}