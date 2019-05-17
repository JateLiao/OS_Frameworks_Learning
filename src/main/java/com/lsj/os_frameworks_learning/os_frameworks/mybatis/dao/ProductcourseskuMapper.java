package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Productcoursesku;

public interface ProductcourseskuMapper {
    int insert(Productcoursesku record);

    int insertSelective(Productcoursesku record);

    Productcoursesku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Productcoursesku record);

    int updateByPrimaryKey(Productcoursesku record);
}