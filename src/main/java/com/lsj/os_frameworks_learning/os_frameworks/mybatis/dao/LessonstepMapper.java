package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Lessonstep;

public interface LessonstepMapper {
    int insert(Lessonstep record);

    int insertSelective(Lessonstep record);

    Lessonstep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lessonstep record);

    int updateByPrimaryKey(Lessonstep record);
}