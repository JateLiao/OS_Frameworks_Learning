package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Dictcode;

public interface DictcodeMapper {
    int insert(Dictcode record);

    int insertSelective(Dictcode record);

    Dictcode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dictcode record);

    int updateByPrimaryKey(Dictcode record);
}