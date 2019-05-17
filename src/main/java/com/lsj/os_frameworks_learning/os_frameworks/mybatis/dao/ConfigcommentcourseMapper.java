package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Configcommentcourse;

public interface ConfigcommentcourseMapper {
    int insert(Configcommentcourse record);

    int insertSelective(Configcommentcourse record);

    Configcommentcourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Configcommentcourse record);

    int updateByPrimaryKey(Configcommentcourse record);
}