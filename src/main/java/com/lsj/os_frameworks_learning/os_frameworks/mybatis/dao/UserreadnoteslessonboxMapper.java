package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userreadnoteslessonbox;

public interface UserreadnoteslessonboxMapper {
    int insert(Userreadnoteslessonbox record);

    int insertSelective(Userreadnoteslessonbox record);

    Userreadnoteslessonbox selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userreadnoteslessonbox record);

    int updateByPrimaryKey(Userreadnoteslessonbox record);
}