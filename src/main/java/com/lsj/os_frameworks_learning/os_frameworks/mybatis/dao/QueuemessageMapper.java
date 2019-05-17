package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Queuemessage;

public interface QueuemessageMapper {
    int insert(Queuemessage record);

    int insertSelective(Queuemessage record);

    Queuemessage selectByPrimaryKey(String key);

    int updateByPrimaryKeySelective(Queuemessage record);

    int updateByPrimaryKeyWithBLOBs(Queuemessage record);

    int updateByPrimaryKey(Queuemessage record);
}