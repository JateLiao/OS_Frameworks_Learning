package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Productpointsgift;

public interface ProductpointsgiftMapper {
    int insert(Productpointsgift record);

    int insertSelective(Productpointsgift record);

    Productpointsgift selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Productpointsgift record);

    int updateByPrimaryKey(Productpointsgift record);
}