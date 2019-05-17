package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userlessonscorelog;

public interface UserlessonscorelogMapper {
    int insert(Userlessonscorelog record);

    int insertSelective(Userlessonscorelog record);

    Userlessonscorelog selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(Userlessonscorelog record);

    int updateByPrimaryKey(Userlessonscorelog record);
}