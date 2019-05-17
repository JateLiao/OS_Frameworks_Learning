package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Activitycoursediscount;

public interface ActivitycoursediscountMapper {
    int insert(Activitycoursediscount record);

    int insertSelective(Activitycoursediscount record);

    Activitycoursediscount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activitycoursediscount record);

    int updateByPrimaryKey(Activitycoursediscount record);
}