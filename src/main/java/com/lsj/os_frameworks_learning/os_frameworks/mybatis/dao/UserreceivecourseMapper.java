package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userreceivecourse;

public interface UserreceivecourseMapper {
    int insert(Userreceivecourse record);

    int insertSelective(Userreceivecourse record);

    Userreceivecourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userreceivecourse record);

    int updateByPrimaryKey(Userreceivecourse record);
}