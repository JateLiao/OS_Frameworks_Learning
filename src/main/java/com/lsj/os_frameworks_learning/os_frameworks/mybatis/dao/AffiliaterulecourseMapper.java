package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Affiliaterulecourse;

public interface AffiliaterulecourseMapper {
    int insert(Affiliaterulecourse record);

    int insertSelective(Affiliaterulecourse record);

    Affiliaterulecourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Affiliaterulecourse record);

    int updateByPrimaryKey(Affiliaterulecourse record);
}