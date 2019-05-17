package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Productcourse;

public interface ProductcourseMapper {
    int insert(Productcourse record);

    int insertSelective(Productcourse record);

    Productcourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Productcourse record);

    int updateByPrimaryKey(Productcourse record);
}