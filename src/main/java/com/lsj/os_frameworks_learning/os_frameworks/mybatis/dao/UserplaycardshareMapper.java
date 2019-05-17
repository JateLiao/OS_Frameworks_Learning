package com.lsj.os_frameworks_learning.os_frameworks.mybatis.dao;

import com.lsj.os_frameworks_learning.os_frameworks.mybatis.model.Userplaycardshare;

public interface UserplaycardshareMapper {
    int insert(Userplaycardshare record);

    int insertSelective(Userplaycardshare record);

    Userplaycardshare selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userplaycardshare record);

    int updateByPrimaryKey(Userplaycardshare record);
}