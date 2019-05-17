package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Productpointsgiftskubanner;

public interface ProductpointsgiftskubannerMapper {
    int insert(Productpointsgiftskubanner record);

    int insertSelective(Productpointsgiftskubanner record);

    Productpointsgiftskubanner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Productpointsgiftskubanner record);

    int updateByPrimaryKey(Productpointsgiftskubanner record);
}