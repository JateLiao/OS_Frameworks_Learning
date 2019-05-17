package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Affiliaterule;

public interface AffiliateruleMapper {
    int insert(Affiliaterule record);

    int insertSelective(Affiliaterule record);

    Affiliaterule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Affiliaterule record);

    int updateByPrimaryKey(Affiliaterule record);
}