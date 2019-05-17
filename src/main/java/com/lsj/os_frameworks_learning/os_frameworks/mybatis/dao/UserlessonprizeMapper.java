package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userlessonprize;

public interface UserlessonprizeMapper {
    int insert(Userlessonprize record);

    int insertSelective(Userlessonprize record);

    Userlessonprize selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userlessonprize record);

    int updateByPrimaryKey(Userlessonprize record);
}