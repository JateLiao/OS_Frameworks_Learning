package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userbaby;

public interface UserbabyMapper {
    int insert(Userbaby record);

    int insertSelective(Userbaby record);

    Userbaby selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userbaby record);

    int updateByPrimaryKey(Userbaby record);
}