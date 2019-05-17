package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Orderpaywechatcallback;

public interface OrderpaywechatcallbackMapper {
    int insert(Orderpaywechatcallback record);

    int insertSelective(Orderpaywechatcallback record);

    Orderpaywechatcallback selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Orderpaywechatcallback record);

    int updateByPrimaryKeyWithBLOBs(Orderpaywechatcallback record);

    int updateByPrimaryKey(Orderpaywechatcallback record);
}