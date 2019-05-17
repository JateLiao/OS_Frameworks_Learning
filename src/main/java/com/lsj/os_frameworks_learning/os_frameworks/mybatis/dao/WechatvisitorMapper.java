package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatvisitor;

public interface WechatvisitorMapper {
    int insert(Wechatvisitor record);

    int insertSelective(Wechatvisitor record);

    Wechatvisitor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Wechatvisitor record);

    int updateByPrimaryKey(Wechatvisitor record);
}