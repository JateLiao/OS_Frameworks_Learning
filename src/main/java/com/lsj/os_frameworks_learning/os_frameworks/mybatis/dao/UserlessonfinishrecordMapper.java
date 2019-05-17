package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userlessonfinishrecord;

public interface UserlessonfinishrecordMapper {
    int insert(Userlessonfinishrecord record);

    int insertSelective(Userlessonfinishrecord record);

    Userlessonfinishrecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userlessonfinishrecord record);

    int updateByPrimaryKey(Userlessonfinishrecord record);
}