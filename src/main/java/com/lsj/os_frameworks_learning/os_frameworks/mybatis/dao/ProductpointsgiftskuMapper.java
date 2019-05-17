package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Productpointsgiftsku;

public interface ProductpointsgiftskuMapper {
    int insert(Productpointsgiftsku record);

    int insertSelective(Productpointsgiftsku record);

    Productpointsgiftsku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Productpointsgiftsku record);

    int updateByPrimaryKey(Productpointsgiftsku record);
}