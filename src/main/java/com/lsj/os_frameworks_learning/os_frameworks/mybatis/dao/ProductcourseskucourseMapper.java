package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Productcourseskucourse;

public interface ProductcourseskucourseMapper {
    int insert(Productcourseskucourse record);

    int insertSelective(Productcourseskucourse record);

    Productcourseskucourse selectByPrimaryKey(Integer seqId);

    int updateByPrimaryKeySelective(Productcourseskucourse record);

    int updateByPrimaryKey(Productcourseskucourse record);
}