package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Courselesson;

public interface CourselessonMapper {
    int insert(Courselesson record);

    int insertSelective(Courselesson record);

    Courselesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Courselesson record);

    int updateByPrimaryKey(Courselesson record);
}