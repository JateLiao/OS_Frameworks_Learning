package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Classscheduleitem;

public interface ClassscheduleitemMapper {
    int insert(Classscheduleitem record);

    int insertSelective(Classscheduleitem record);

    Classscheduleitem selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Classscheduleitem record);

    int updateByPrimaryKey(Classscheduleitem record);
}