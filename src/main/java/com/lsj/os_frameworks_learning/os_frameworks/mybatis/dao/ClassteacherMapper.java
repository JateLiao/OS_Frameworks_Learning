package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Classteacher;

public interface ClassteacherMapper {
    int insert(Classteacher record);

    int insertSelective(Classteacher record);

    Classteacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classteacher record);

    int updateByPrimaryKey(Classteacher record);
}