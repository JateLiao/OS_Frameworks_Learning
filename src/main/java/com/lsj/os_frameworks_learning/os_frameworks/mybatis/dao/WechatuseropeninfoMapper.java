package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatuseropeninfo;

public interface WechatuseropeninfoMapper {
    int insert(Wechatuseropeninfo record);

    int insertSelective(Wechatuseropeninfo record);

    Wechatuseropeninfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wechatuseropeninfo record);

    int updateByPrimaryKey(Wechatuseropeninfo record);
}