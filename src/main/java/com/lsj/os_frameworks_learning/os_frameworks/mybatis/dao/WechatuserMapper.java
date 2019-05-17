package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Wechatuser;

public interface WechatuserMapper {
    int insert(Wechatuser record);

    int insertSelective(Wechatuser record);

    Wechatuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wechatuser record);

    int updateByPrimaryKey(Wechatuser record);
}