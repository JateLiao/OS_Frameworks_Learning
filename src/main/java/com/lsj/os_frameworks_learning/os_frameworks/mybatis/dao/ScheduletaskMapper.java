package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Scheduletask;

public interface ScheduletaskMapper {
    int insert(Scheduletask record);

    int insertSelective(Scheduletask record);

    Scheduletask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Scheduletask record);

    int updateByPrimaryKeyWithBLOBs(Scheduletask record);

    int updateByPrimaryKey(Scheduletask record);
}