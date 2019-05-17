package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Classschedule;

public interface ClassscheduleMapper {
    int insert(Classschedule record);

    int insertSelective(Classschedule record);

    Classschedule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classschedule record);

    int updateByPrimaryKey(Classschedule record);
}