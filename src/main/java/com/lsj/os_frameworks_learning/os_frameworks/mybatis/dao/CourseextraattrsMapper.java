package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Courseextraattrs;

public interface CourseextraattrsMapper {
    int insert(Courseextraattrs record);

    int insertSelective(Courseextraattrs record);

    Courseextraattrs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Courseextraattrs record);

    int updateByPrimaryKey(Courseextraattrs record);
}