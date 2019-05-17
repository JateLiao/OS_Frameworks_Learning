package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatinfo;

public interface WechatinfoMapper {
    int insert(Wechatinfo record);

    int insertSelective(Wechatinfo record);

    Wechatinfo selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Wechatinfo record);

    int updateByPrimaryKey(Wechatinfo record);
}