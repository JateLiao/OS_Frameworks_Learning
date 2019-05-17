package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Coursesegment;

public interface CoursesegmentMapper {
    int insert(Coursesegment record);

    int insertSelective(Coursesegment record);

    Coursesegment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Coursesegment record);

    int updateByPrimaryKey(Coursesegment record);
}