package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Configcommentlessonstep;

public interface ConfigcommentlessonstepMapper {
    int insert(Configcommentlessonstep record);

    int insertSelective(Configcommentlessonstep record);

    Configcommentlessonstep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Configcommentlessonstep record);

    int updateByPrimaryKey(Configcommentlessonstep record);
}